import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Vehicle> rentedVehicles;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.rentedVehicles = new ArrayList<>();
    }

    public void rentVehicle(Vehicle vehicle) {
        rentedVehicles.add(vehicle);
    }

    public void returnVehicle(Vehicle vehicle) {
        rentedVehicles.remove(vehicle);
    }

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Email: " + email;
    }
}

