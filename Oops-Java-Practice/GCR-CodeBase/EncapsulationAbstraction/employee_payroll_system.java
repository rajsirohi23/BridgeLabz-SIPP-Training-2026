abstract class Employee {
    private int employeeId;
    private String employeeName;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee();
        f.setEmployeeId(101);
        f.setEmployeeName("Rahul");
        f.setMonthlySalary(50000);

        PartTimeEmployee p = new PartTimeEmployee();
        p.setEmployeeId(102);
        p.setEmployeeName("Aman");
        p.setHoursWorked(40);
        p.setHourlyRate(200);

        f.displayEmployeeInfo();
        System.out.println("Salary: " + f.calculateSalary());

        System.out.println();

        p.displayEmployeeInfo();
        System.out.println("Salary: " + p.calculateSalary());
    }
}
