abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    abstract double calculateRentalCost(int days);

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class Car extends Vehicle {
    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {
    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {
    private double dailyRate;
    private double loadingCharge;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setVehicleNumber("CAR101");
        car.setVehicleType("Car");
        car.setDailyRate(1000);

        Bike bike = new Bike();
        bike.setVehicleNumber("BIKE101");
        bike.setVehicleType("Bike");
        bike.setDailyRate(300);

        Truck truck = new Truck();
        truck.setVehicleNumber("TRUCK101");
        truck.setVehicleType("Truck");
        truck.setDailyRate(2000);
        truck.setLoadingCharge(500);

        int days = 5;

        car.displayVehicleInfo();
        System.out.println("Rental Cost: " + car.calculateRentalCost(days));

        System.out.println();

        bike.displayVehicleInfo();
        System.out.println("Rental Cost: " + bike.calculateRentalCost(days));

        System.out.println();

        truck.displayVehicleInfo();
        System.out.println("Rental Cost: " + truck.calculateRentalCost(days));
    }
}
