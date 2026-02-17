package BankingAccountSystem;

public class SavingAccount extends Account{


    SavingAccount(int AccountNo, String AccountHolder){
       super(AccountNo,AccountHolder,1000);
    }

    @Override
    void deposit(float amount) {
        setBalance(getBalance()+amount);
    }

    @Override
    void withdraw(float amount) throws InsufficientBalanceException {
        if(amount>getBalance()||((getBalance())-amount<1000)){
            throw new InsufficientBalanceException("Insufficient balance");
        }else{
             setBalance(getBalance()-amount);
        }
    }

}
