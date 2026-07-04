class BankAccount {

    private String accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(holder + " deposited ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance for " + holder);
        } else {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        }
    }

    void getStatement() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("A101", "Rahul", 10000);
        BankAccount a2 = new BankAccount("A102", "Priya", 15000);
        BankAccount a3 = new BankAccount("A103", "Aman", 8000);

        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(2000);
        a1.withdraw(1500);
        a1.deposit(300);

        a2.deposit(500);
        a2.withdraw(1000);
        a2.deposit(1500);
        a2.withdraw(700);
        a2.deposit(400);

        a3.deposit(1000);
        a3.withdraw(500);
        a3.deposit(700);
        a3.withdraw(200);
        a3.deposit(900);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("\nTotal Accounts Created = "
                + BankAccount.totalAccounts);
    }
}