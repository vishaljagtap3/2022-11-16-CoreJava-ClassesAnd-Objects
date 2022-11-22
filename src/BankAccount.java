//Encapsulation - making sure that the state of an object can be
//changed/accessed/modified only by the member functions of the class.

public class BankAccount {

    private int accNo;
    private String name;
    private float bal;

    public BankAccount() {
        System.out.println("BankAccount()");
        accNo = 100;
        name = "Not Available";
        bal = 0F;
    }

    public BankAccount(int accNo, String name, float bal) {
        this.accNo = accNo;
        this.name = name;
        this.bal = bal;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("acc no = " + accNo + " name = " + name + " bal = " + bal);
    }



    public float getBal() {
        return bal;
    }

    public int withdraw(int amt) {
        if(bal < amt) {
            return 0;
        }

        bal = bal - amt;
        return amt;
    }

    public boolean deposit(int amt) {
        if(amt <= 0) {
            return false;
        }

        bal = bal + amt;
        return true;
    }
}












