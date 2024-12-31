public class App {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Adding vehicles to the fleet
        agency.addVehicle(new Car("C001", "Toyota Corolla", 50, true));
        agency.addVehicle(new Motorcycle("M001", "Daniel", 30));
        agency.addVehicle(new Truck("T001", "Ford", 80, 5));

        // Display available vehicles
        System.out.println("Available Fleet:");
        agency.displayFleet();

        // Renting a car
        Customer customer = new Customer("John", "john@gmail.com");
        Vehicle vehicle = agency.findAvailableVehicle("Car");
        if (vehicle != null) {
            vehicle.setAvailable(false);
            customer.rentVehicle(vehicle);
            System.out.println("Rented Vehicle: " + vehicle);
        }

        // Returning the vehicle
        if (!customer.getRentedVehicles().isEmpty()) {
            Vehicle rentedVehicle = customer.getRentedVehicles().get(0);
            rentedVehicle.setAvailable(true);
            customer.returnVehicle(rentedVehicle);
            System.out.println("Returned Vehicle: " + rentedVehicle);
        }
    }
}

