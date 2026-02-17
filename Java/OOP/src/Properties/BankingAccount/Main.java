package Properties.BankingAccount;

public class Main {
    public static void main(String[] args) {
//
//        Bank raju= new Bank(1000024330,0);
//
//        raju.deposit(1000);
//        raju.display();
//        raju.withdraw(567);
//        raju.display();
//
//        Bank raju;
//
//        raju= new Saving(100024330);
//
//        raju.display();
//        raju.withdraw(200);
//        raju.display();
//        raju.deposit(1000);
//        raju.withdraw(100);
//        raju.display();
//
//        raju = new Current(1000024330,500);
//
//        raju.display();
//        raju.withdraw(499);
//        raju.display();
//        raju.deposit(100000);
//        raju.display();

        Bank raju= new Current(24330,0);
        raju.setBalance(1000);
        System.out.println(raju.getBalance());
        raju.deposit("tv",1000);

        raju = new Saving(24330);
        raju.setBalance(0);
        raju.display();

//        System.out.println(raju.hashCode());
//        System.out.println(raju.toString());    methods of Object class

    }
}
