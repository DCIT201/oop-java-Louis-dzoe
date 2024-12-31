import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TruckTest {
    @Test
    void testCalculateRentalCost() {
        Truck truck = new Truck("T001", "Volvo", 100, 2000);
        assertEquals(300, truck.calculateRentalCost(3), "Rental cost is incorrect");
    }

    @Test
    void testToString() {
        Truck truck = new Truck("T002", "Ford", 120, 1500);
        assertTrue(truck.toString().contains("Ford"), "toString output is incorrect");
    }
}

