public class Account {
    private double balance;

    public Account(double initBalance) {
        if (initBalance > 0) {
            balance = initBalance;
        } else {
            balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(Account anotherAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            anotherAccount.balance += amount;
        }
    }
}