package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setOwnerName("Kaustubh Ajgaonkar");
        bankAccount1.deposit(1000);
        bankAccount1.withdraw(5000);
        bankAccount1.withdraw(500);
        System.out.println("These are the transaction(s)");
        for(String transaction: bankAccount1.getTransactionHistory()){
            System.out.println(transaction);
        }

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setOwnerName("Utsav Kolamkar");
        bankAccount2.deposit(5000);
        bankAccount2.withdraw(2000);
        bankAccount2.withdraw(500);
        System.out.println("These are the transaction(s)");
        for(String transaction: bankAccount2.getTransactionHistory()){
            System.out.println(transaction);
        }

        User u1 = new User("Kaustubh", "Mypass", "kaustubh@gmail.com");
        User u2 = new User(u1);
        System.out.println(u1);
        System.out.println(u2);
    }
}
