package Properties.BankingAccount;

public class Bank {
     private int accountNo;
     private double balance;

    Bank(){
        this.accountNo=0;
        this.balance=0;
    }

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return "Bank{" +
//                "accountNo=" + accountNo +
//                ", balance=" + balance +
//                '}';
//    }

    Bank(int accountNo, double balance){
        this.accountNo=accountNo;
        this.balance=balance;
    }

    public int getAccountNo(){
        return accountNo;
    }

    public void setAccountNo(int account){
        this.accountNo=account;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    void deposit(double amount){
        if(amount>0){
            this.balance+=amount;
        }else{
            System.out.println("No money to deposit");
        }
    }

    void deposit(String name, double amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println(name+" deposited "+amount+" to account number "+getAccountNo());
        }else{
            System.out.println("No money to deposit");
        }
    }

    void withdraw(double amount){
        if(balance<0||balance < amount){
            System.out.println("insufficient balance");
        }else{
            this.balance-=amount;
        }
    }

    void display(){
        System.out.println("Account number: "+this.accountNo+" have: "+this.balance);
    }


}
