package BankingAccountSystem;

public abstract class Account {
    private int AccountNo;
   private  String AcccountHolder;
    private float balance;

    Account(int accountNo,String name,float balance){
        this.AccountNo=accountNo;
        this.AcccountHolder=name;
        this.balance=balance;
    }

    abstract void deposit(float amount);
    abstract void withdraw(float amount) throws InsufficientBalanceException;
    void display() {
        System.out.println(AcccountHolder+" having account No. "+AccountNo+" have balance "+balance);
    }

    public String getAcccountHolder() {
        return AcccountHolder;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public float getBalance() {
        return balance;
    }



    public void setBalance(float balance) {
        this.balance = balance;
    }

}
