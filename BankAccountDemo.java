class BankAccount {
    // Attributes
    public String accountHolder;
    private double balance;
    protected String accountType;

    // Constructor to initialize account details
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        myAccount.displayAccountDetails();

        myAccount.deposit(250.0);

        myAccount.withdraw(100.0);

        myAccount.displayAccountDetails();

        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
