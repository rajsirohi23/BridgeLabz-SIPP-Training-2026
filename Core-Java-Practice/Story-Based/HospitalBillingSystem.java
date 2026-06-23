import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static double calculateAverageBill(double totalBill, int items) {
        return totalBill / items;
    }

    public static void processPayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed! Insufficient funds. Required: ₹"
                            + billAmount + ", Paid: ₹" + payment);
        }

        System.out.println("Payment Successful!");
        System.out.println("Balance Returned: ₹" + (payment - billAmount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] patients = {"Raj", "Amit", "Neha"};

        try {
            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of bill items: ");
            int items = Integer.parseInt(sc.nextLine());

            double avgBill = calculateAverageBill(totalBill, items);
            System.out.println("Average Cost per Item: ₹" + avgBill);

            System.out.print("Enter patient index (0-2): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Name: " + patients[index]);

            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            processPayment(totalBill, payment);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of bill items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index entered.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values only.");

        } catch (InsufficientFundsException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());

        } finally {
            System.out.println("Hospital billing process completed.");
            sc.close();
        }
    }
}