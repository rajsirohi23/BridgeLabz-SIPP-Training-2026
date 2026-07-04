class Vehicle {

    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber,
            String ownerName,
            String vehicleType) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println(
                vehicleNumber + " | " +
                ownerName + " | " +
                vehicleType);
    }
}

public class SmartParkingManagement {

    static void displayCars(Vehicle[] vehicles) {

        System.out.println("\nCars:");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {

        System.out.println("\nBikes:");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP01A1",
                "Rahul", "Car");

        vehicles[1] = new Vehicle("UP01A2",
                "Priya", "Bike");

        vehicles[2] = new Vehicle("UP01A3",
                "Aman", "Car");

        vehicles[3] = new Vehicle("UP01A4",
                "Neha", "Bike");

        vehicles[4] = new Vehicle("UP01A5",
                "Rohan", "Car");

        vehicles[5] = new Vehicle("UP01A6",
                "Anjali", "Bike");

        vehicles[6] = new Vehicle("UP01A7",
                "Karan", "Car");

        vehicles[7] = new Vehicle("UP01A8",
                "Sneha", "Bike");

        vehicles[8] = new Vehicle("UP01A9",
                "Vikas", "Car");

        vehicles[9] = new Vehicle("UP01A10",
                "Pooja", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}