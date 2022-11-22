public class Main {
    public static void main(String[] args) {

        //BankAccount b1 = new BankAccount();
        BankAccount b1 = new BankAccount(1001, "Vishal Jagtap", 3000F);
        b1.display();
        b1.setAccNo(101);
        b1.setName("Vishal");
        b1.deposit(1000);
        b1.display();

        b1 = new BankAccount();
        b1.setAccNo(202);
        b1.setName("Sashi");
        b1.deposit(2000);
        b1.display();

        BankAccount b2 = b1;
        b2.display();

    }
}
