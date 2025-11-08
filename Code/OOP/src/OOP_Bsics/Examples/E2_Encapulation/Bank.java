package OOP_Bsics.Examples.E2_Encapulation;

public class Bank {
    private String AccountHolderName;
    private int AccountNo;
    private float balance;

    Bank(String name, int AccountNo,float balance){
        this.AccountHolderName=name;
        this.AccountNo=AccountNo;
        this.balance=balance;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int accountNo) {
        AccountNo = accountNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    void deposit(float amount){
        this.balance=amount;
    }

    void withdraw(float amount){
        if(this.balance<amount){
            System.out.println("insufficient balance");
        }else{
            this.balance-=amount;
        }
    }

    public String toString(){
        return "AccountHolder="+AccountHolderName+" AccountNo="+AccountNo+" Balance="+balance;
    }
}

