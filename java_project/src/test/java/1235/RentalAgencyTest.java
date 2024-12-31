import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class RentalAgencyTest {
    @Test
    void testAddVehicle() {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("C001", "Toyota Corolla", 50, true);
        agency.addVehicle(car);

        assertTrue(agency.getFleet().contains(car), "Vehicle should be added to the fleet");
    }

    @Test
    void testSearchAvailableVehicles() {
        RentalAgency agency = new RentalAgency();
        Car car1 = new Car("C001", "Toyota Corolla", 50, true);
        Motorcycle motorcycle = new Motorcycle("M001", "Ducatti", 30, true);
        agency.addVehicle(car1);
        agency.addVehicle(motorcycle);

        List<Vehicle> availableCars = agency.searchAvailableVehicles(Car.class);
        assertEquals(1, availableCars.size(), "Should find one available car");
        assertTrue(availableCars.contains(car1), "Car should be in the search results");
    }

    @Test
    void testRentAndReturnVehicle() {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("C001", "Toyota Corolla", 50, true);
        Customer customer = new Customer("John", "john@gmail.com");

        agency.addVehicle(car);
        agency.rentVehicle(customer, car, 3);

        assertFalse(car.isAvailable(), "Vehicle should be marked unavailable after rental");
        assertTrue(customer.getCurrentRentals().contains(car), "Vehicle should be added to customer's rentals");

        agency.returnVehicle(customer, car);
        assertTrue(car.isAvailable(), "Vehicle should be marked available after return");
        assertFalse(customer.getCurrentRentals().contains(car), "Vehicle should be removed from customer's rentals");
    }
}

