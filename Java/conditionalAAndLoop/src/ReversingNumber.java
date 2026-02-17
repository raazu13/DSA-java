import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse:");

        int num = n.nextInt();

        n.close();


        int reverse = 0;

        while (num!=0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;

            num = num / 10;

        }

         System.out.printf("the reversed number is %d", reverse);


    }
}
