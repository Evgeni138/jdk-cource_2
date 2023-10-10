package lesson2;

public class Program {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(-1000);

        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(500);
        bankAccount.withdraw(300);
    }
}
