import java.util.Scanner;

public class Q7_Fibonacci {
    public static void main(String[] args) {


        Scanner in =new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n=in.nextInt();

        nFiboSeries(n);

    }

    public static int fibo(int n){
        if(n<=1){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    public static void  nFiboSeries(int n){
        for(int i=0; i<=n; i++){
            System.out.print(fibo(i)+" ");
        }
    }

}
