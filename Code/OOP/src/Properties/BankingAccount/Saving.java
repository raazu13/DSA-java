package Properties.BankingAccount;

public class Saving extends Bank {

    Saving(int accountNo){

        setAccountNo(accountNo);
        setBalance(1000);
    }

    public void setBalance(double balance){
         if (balance <1000){
             System.out.println("Insufficient balance , minimum balance to be set is 1000");
         }else{
            super.setBalance(balance);
         }
    }

    @Override
    void withdraw(double amount){
        if((getBalance()-amount)<1000){
            System.out.println("insufficient balance");
        }else{
            setBalance(getBalance()-amount);
        }
    }


}
