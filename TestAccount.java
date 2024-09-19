public class TestAccount {
    public static void main(String[] args) {

        // Creating two accounts
        Account acc1 = new Account("1", "Account1", 5000);
        Account acc2 = new Account("2", "Account2", 4000);

        // Displaying the initial account balance
        System.out.println("Initial balance of account 1: $" + acc1.getBalance());
        System.out.println("Initial balance of account 2: $" + acc2.getBalance());

        // transfering between accounts
        acc1.transferTo(acc2, 1000);

        // Displays the balance after the transfer
        System.out.println("Balance of account 1 after the transfer is $" + acc1.getBalance());
        System.out.println("Balance of account 2 after the transfer is $" + acc2.getBalance());

    }
}
