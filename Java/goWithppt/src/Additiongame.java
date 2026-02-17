import java.util.Scanner;



public class Additiongame {

    public static void main(String[] args){

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);


        int correctAnswer = num1 + num2;
        Scanner input =new Scanner(System.in);

        System.out.print("What is : "+num1+"+"+num2+":");
        int ans = input.nextInt();

        if ( ans == correctAnswer){
            System.out.println("You are Correct");
        } else {
            System.out.println("You are Wrong!! "+ "The correct answer is "+ correctAnswer);
        }
        input.close();


    }

}
