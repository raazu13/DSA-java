import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        printPrime();
       Scanner input = new Scanner(System.in);

       System.out.println("\n Enter the number to check if it is prime:");
       int n= input.nextInt();

       input.close();

       if (isprime(n)){
           System.out.println("isprime");
       }else{
           System.out.println("isNotprime");
       }

       printPrime();


    }

    static void printPrime() {
        for(int i=0; i<=50; i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }

    }

    static boolean isprime(int n) {
        if (n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }


}
