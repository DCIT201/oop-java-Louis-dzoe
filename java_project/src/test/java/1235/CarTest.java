import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void testCalculateRentalCost_WithGPS() {
        Car car = new Car("C001", "Toyota Corolla", 50, true);
        assertEquals(150, car.calculateRentalCost(3), "Rental cost with GPS is incorrect");
    }

    @Test
    void testCalculateRentalCost_WithoutGPS() {
        Car car = new Car("C002", "Honda Civic", 50, false);
        assertEquals(100, car.calculateRentalCost(2), "Rental cost without GPS is incorrect");
    }

    @Test
    void testToString() {
        Car car = new Car("C003", "Ford", 60, true);
        assertTrue(car.toString().contains("Ford"), "toString output is incorrect");
    }
}

