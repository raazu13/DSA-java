import java.util.Scanner;

public class findlargestnum {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        input.close();

        int max = Math.max(c, Math.max(a, b));
        /* int max = a;
        if(b>max){
            max =b;
        }
         if (c> max ){
             max = c;
         }*/

         System.out.printf("The max number is %d", max);



    }
}
