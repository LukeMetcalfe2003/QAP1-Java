public class Account {
    private String id;
    private String name;
    private int balance;

    // constructors for the 2 accounts
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Method for geting id
    public String getID() {
        return id;
    }

    // Method for getting name
    public String getName() {
        return name;
    }

    // method for getting balance
    public int getBalance() {
        return balance;
    }

    // Method for credit
    public int credit(int amount) {
        balance += amount;

        return balance;
    }

    // Method for debit
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance.");
        }

        return balance;
    }

    // Transfer between accounts
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceede balance.");
        }

        return balance;
    }

    // Formatting the output
    public String toString() {
        return "Account {ID=" + id + ", name=" + name + ", balance=" + balance + "}";
    }

}