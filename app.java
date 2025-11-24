public class HelloWorld {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello, GitHub!");
        
        // Show current date and time
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);
        
        // Simple addition
        int a = 5, b = 10;
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }
}
// Dev 2 push from thr local instance 
public class BankAccount {

    // 1. Attributes (The data)
    // These variables store the state of the account.
    private String accountHolder;
    private double balance;

    // 2. Constructor (The setup)
    // This runs once when we create a new account.
    public BankAccount(String name, double initialDeposit) {
        this.accountHolder = name;
        this.balance = initialDeposit;
        System.out.println("Welcome, " + name + "! Account created.");
    }

    // 3. Methods (The behavior/actions)

    // Method to add money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Method to remove money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }

    // Method to show current status
    public void displayBalance() {
        System.out.println("Current Balance for " + accountHolder + ": $" + balance);
    }

    // ==========================================
    // 4. Main Method (The entry point)
    // The computer starts reading the code here.
    // ==========================================
    public static void main(String[] args) {
        System.out.println("--- BANK SYSTEM STARTING ---\n");

        // Create User 1 (An Object)
        BankAccount user1 = new BankAccount("Alice", 500.00);
        user1.deposit(150.00);
        user1.withdraw(50.00);
        user1.displayBalance();

        System.out.println("\n------------------------\n");

        // Create User 2 (A different Object)
        BankAccount user2 = new BankAccount("Bob", 100.00);
        user2.withdraw(200.00); // This should fail
        user2.displayBalance();
        
        System.out.println("\n--- BANK SYSTEM CLOSED ---");
    }
}

