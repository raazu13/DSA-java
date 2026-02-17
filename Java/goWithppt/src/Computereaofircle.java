import java.util.Scanner;

public class Computereaofircle {
    public static void main(String[] args){

        System.out.println("Calculate Area of Circle");

        Scanner radius= new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int rad = radius.nextInt();

        double area = 3.14 * rad* rad;

        System.out.println("The area of the circle is " + area);

        radius.close();

    }
}
