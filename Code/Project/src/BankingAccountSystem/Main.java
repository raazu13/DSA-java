//🧠 Weekend Project — “Bank Account System”
//  Concepts Used: Encapsulation, Exception Handling, Polymorphism, Custom Exception
//   Tasks:
//        • Classes: Account (abstract), SavingsAccount, CurrentAccount
//	      • Add methods: deposit(), withdraw()
//        • Custom Exception: InsufficientBalanceException
//	      • Use ArrayList<Account> to store accounts.
//  Print all account details.

package BankingAccountSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        ArrayList<Account> accounts = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        String name;
        int accountNo;
        float amount;
        boolean check;

        int choice;
        do{
            System.out.println(".......Banking System.....");
            System.out.println("What you want to do: ");
            System.out.println("1.Create acoount\n2.Deposit\n3.Withdraw\n4.Check balance\n5.Display Accounts\n6.Exit");
            System.out.print("Enter your Choice here: ");
            choice = in.nextInt();
            in.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter your name: ");
                     name= in.nextLine();
                    System.out.println("Enter Account No. : ");
                     accountNo=in.nextInt();
                     in.nextLine();
                    System.out.println("Enter Type of your Account\n1.Saving Account\t2.Current Account");
                    int type=in.nextInt();

                    if(type==1){
                        Account acc=new SavingAccount(accountNo,name);
                        accounts.add(acc);
                    }else{
                        Account acc=new CurrentAccount(accountNo,name);
                        accounts.add(acc);
                    }

                    System.out.println("Congratulations Your Account Created Successfully");
                    break;

                case 2:
                    check=false;
                    System.out.println("Enter Account Holder Name: ");
                    name=in.nextLine();
                    System.out.println("enter Amount: ");
                    amount=in.nextFloat();
                    for(Account a:accounts){
                        if(a.getAcccountHolder().equalsIgnoreCase(name)){
                            a.deposit(amount);
                            check=true;
                            System.out.println("Mr./Mrs/Ms "+a.getAcccountHolder()+"Deposited "+amount+" to your account "+a.getAccountNo());
                            break;
                        }
                    }
                    if(!check){
                        System.out.println("account not found");
                    }

                    break;

                case 3:
                    check=false;
                    System.out.println("Enter Account Holder Name: ");
                    name=in.nextLine();
                    System.out.println("enter Amount: ");
                    amount=in.nextFloat();
                    for(Account a:accounts){
                        if(a.getAcccountHolder().equalsIgnoreCase(name)){
                           try {
                               a.withdraw(amount);
                               System.out.println("Mr./Mrs/Ms " + a.getAcccountHolder() + " withdrawed " + amount + " from your account " + a.getAccountNo() + "your new balance is " + a.getBalance());

                           }catch(InsufficientBalanceException e){
                               System.out.println("Insufficient balance");
                            }
                           check=true;
                           break;
                        }
                    }
                    if(!check){
                        System.out.println("Account not found");
                    }
                    break;

                case 4:
                    check=false;
                    System.out.println("Enter Account Holder Name: ");
                    name=in.nextLine();

                    for(Account a:accounts){
                        if(a.getAcccountHolder().equalsIgnoreCase(name)){
                            System.out.println("your balance is "+a.getBalance());
                            a.display();
                            check=true;
                            break;
                        }
                    }
                    if(!check){
                        System.out.println("Account not found");
                    }
                    break;


                case 5:
                    for(Account i:accounts){
                        i.display();
                    }
                    break;

                case 6:
                    System.out.println("Exiting Banking system ....Bye and have good day");
                    break;
                default:
                    System.out.println("Invalid choice !!!");


            }

        }while(choice!=6);

    }
}
