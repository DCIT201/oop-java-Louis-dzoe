import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String type) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable() && vehicle.getType().equalsIgnoreCase(type)) {
                return vehicle;
            }
        }
        return null;
    }

    public void displayFleet() {
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle);
        }
    }
}

