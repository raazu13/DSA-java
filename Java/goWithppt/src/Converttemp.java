import java.util.Scanner;

public class Converttemp {
    public static void main(String[] args){
        System.out.println("TEMP CONVERTER");

        Scanner input = new Scanner(System.in);
        System.out.println("Choose 1 for converting celsius into farenheit and 2 for farenheit into celsius");

        int a = input.nextInt();

        if(a==1){
            System.out.println("Enter temperature in celsius: ");
            double c = input.nextDouble();
            double f = c * 9 / 5 + 32 ;
            System.out.println(c+"degree celsius = "+f +" degree farenheit");
        }
        else if(a==2){
            System.out.println("Enter temperature in farenheit: ");
            double f = input.nextDouble();
            double c= (f-32)*5/9;
            System.out.println(f+"degree farenheit = "+c +" degree celsius");


        }else{

            System.out.println("Invalid input !!! ");
        }
        input.close();


    }
}
