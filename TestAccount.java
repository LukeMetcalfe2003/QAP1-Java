public class TestAccount {
    public static void main(String[] args) {

        Account acc1 = new Account(5000);
        Account acc2 = new Account(4000);

        System.out.println("Initial balance of account 1: $" + acc1.getBalance());
        System.out.println("Initial balance of account 2: $" + acc2.getBalance());

        acc1.transfer(acc2, 1000);

        System.out.println("Balance of account 1 after the transfer is $" + acc1.getBalance());
        System.out.println("Balance of account 2 after the transfer is $" + acc2.getBalance());

    }
}
