import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    void testAddRental() {
        Customer customer = new Customer("John", "john@gmail.com");
        Car car = new Car("C001", "Toyota Corolla", 50, true);
        customer.addRental(car);

        assertTrue(customer.getCurrentRentals().contains(car), "Car should be added to the customer's rentals");
    }

    @Test
    void testRemoveRental() {
        Customer customer = new Customer("John", "john@gmail.com");
        Car car = new Car("C001", "Toyota Corolla", 50, true);
        customer.addRental(car);
        customer.removeRental(car);

        assertFalse(customer.getCurrentRentals().contains(car), "Car should be removed from the customer's rentals");
    }
}

