import java.util.Scanner;

public class Q4_operationsOn3Numb {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.print("Enter the 3 numbers: ");

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        in.close();

        int sum=a+b+c;
        int difference=a-b-c;
        int product=a*b*c;

        double average= sum/3.0;
        int max= ((a>b)&&(a>c))?a:((b>c)?b:c);
        int min= ((a<b)&&(a<c))?a:((b<c)?b:c);

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product);
        System.out.println("Average: "+average);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
