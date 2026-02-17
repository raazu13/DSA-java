package BankingAccountSystem;

public class CurrentAccount extends Account{

    CurrentAccount(int AccountNo, String AccountHolder){
        super(AccountNo,AccountHolder,0);
    }

    @Override
    void deposit(float amount) {

        setBalance(getBalance()+amount);
    }

    @Override
    void withdraw(float amount) throws InsufficientBalanceException {
        if((getBalance()-amount)< -100000 ){
            throw new InsufficientBalanceException("Insufficient balance");
        }else{
            setBalance(getBalance()-amount);
        }
    }


}
