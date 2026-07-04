class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    private String stationId;
    private double unitsConsumed;

    ChargingStation(String stationId,
                    double unitsConsumed) {

        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("\nStation ID: " +
                stationId);

        System.out.println("Units Consumed: " +
                unitsConsumed);

        System.out.println("Bill: ₹" +
                calculateBill());
    }
}

public class ChargingStationDemo {

    public static void main(String[] args) {

        ChargingStation s1 =
                new ChargingStation("S101", 100);

        ChargingStation s2 =
                new ChargingStation("S102", 120);

        ChargingStation s3 =
                new ChargingStation("S103", 90);

        ChargingStation s4 =
                new ChargingStation("S104", 150);

        ChargingStation s5 =
                new ChargingStation("S105", 80);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println(
                "\nTotal Stations = "
                        + ChargingStation.totalStations);

        System.out.println(
                "\nChanging electricity rate...");

        ChargingStation.electricityRate = 10;

        s1.displayStationDetails();
    }
}