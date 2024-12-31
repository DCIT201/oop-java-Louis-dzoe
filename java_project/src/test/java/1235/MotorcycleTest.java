import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MotorcycleTest {
    @Test
    void testCalculateRentalCost() {
        Motorcycle motorcycle = new Motorcycle("M001", "Ducatti", 30, true);
        assertEquals(90, motorcycle.calculateRentalCost(3), "Rental cost is incorrect");
    }

    @Test
    void testToString() {
        Motorcycle motorcycle = new Motorcycle("M002", "Range Rover", 40, true);
        assertTrue(motorcycle.toString().contains("Range Rover), "toString output is incorrect");
    }
}
i
