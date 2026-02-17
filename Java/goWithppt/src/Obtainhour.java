import java.util.Scanner;

public class Obtainhour {
    public static void main(String[] args){

        System.out.println("TO CONVERT SECOND INTO HOUR AND MIN.");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the second which you want convert: ");
         int second = input.nextInt();

         int minute = second / 60 ;
           second =  second % 60 ;

          int hour = minute / 60;
          minute = minute % 60;

          System.out.println("The time is : "+hour+"hour "+minute+"min "+second+"sec");
          input.close();


    }
}
