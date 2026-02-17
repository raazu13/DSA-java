import java.util.Scanner;

public class SubtractionGame {
    public static void main(String[] args){

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        if(num1 < num2){
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;


        }

        int  correctAns = num1 - num2 ;

        Scanner input = new Scanner(System.in);
        System.out.println("what is : "+num1+"-"+num2+":");
        int ans = input.nextInt();

        boolean Iscorrect = ans == correctAns;
         if(Iscorrect){
             System.out.println("You are correct !!");
         }else{
             System.out.println("You are Incorrect !! The correct answer is :"+correctAns);
         }

        input.close();

    }

}
