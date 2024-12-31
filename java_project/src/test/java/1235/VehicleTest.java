import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VehicleTest {
    @Test
    void testEncapsulation() {
        Car car = new Car("C001", "Toyota Corolla", 50, true);
        assertEquals("C001", car.getVehicleId());
        car.setModel("Toyota Camry");
        assertEquals("Toyota Camry", car.getModel());
    }

    @Test
    void testAvailability() {
        Motorcycle motorcycle = new Motorcycle("M001", "Daniel", 30, true);
        assertTrue(motorcycle.isAvailable());
        motorcycle.setAvailable(false);
        assertFalse(motorcycle.isAvailable());
    }
}

