package Properties.BankingAccount;

public class Current extends Bank {

//    Current(int accountNo,double amount){
//        setAccountNo(accountNo);
//        setBalance(amount);
//    }

    Current(int accountNo, double amount){
        super(accountNo,amount);
    }



    void withdraw(double amount){
        if(getBalance()<amount){
            System.out.println("insufficient balance");
        }else{
             setBalance(getBalance()-amount);
        }
    }


}

