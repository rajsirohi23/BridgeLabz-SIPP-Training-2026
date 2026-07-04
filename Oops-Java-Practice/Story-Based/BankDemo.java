class BankAccount {

    private String accountNumber;
    private String holder;
    private double balance;

    // Static variable to track total accounts
    static int totalAccounts = 0;

    // Constructor
    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(holder + " deposited ₹" + amount);
    }

    // Withdraw method with overdraft check
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(holder +
                    ": Withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        }
    }

    // Statement method
    public void getStatement() {
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("-----------------------------");
    }
}

public class BankDemo {

    public static void main(String[] args) {

        // Create 3 accounts
        BankAccount acc1 =
                new BankAccount("A101", "Rahul", 10000);

        BankAccount acc2 =
                new BankAccount("A102", "Priya", 15000);

        BankAccount acc3 =
                new BankAccount("A103", "Aman", 8000);

        // 5 Transactions for Account 1
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(10000);

        // 5 Transactions for Account 2
        acc2.deposit(1000);
        acc2.withdraw(5000);
        acc2.deposit(3000);
        acc2.withdraw(2000);
        acc2.withdraw(7000);

        // 5 Transactions for Account 3
        acc3.deposit(2500);
        acc3.withdraw(1000);
        acc3.deposit(1500);
        acc3.withdraw(2000);
        acc3.withdraw(12000);

        // Print statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Total accounts created
        System.out.println("\nTotal Accounts Created = "
                + BankAccount.totalAccounts);
    }
}