import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args){

        int lotteryNum = (int) ( Math.random() * 90 + 10);

        Scanner guess = new Scanner( System.in);
        System.out.print("Guess the Number between 10 to 99 :");

        int guessNum = guess.nextInt();

        guess.close();

        int Ldigit1= lotteryNum / 10;
        int Ldigit2 = lotteryNum % 10;

        int gdigit1= guessNum /10;
        int gdigit2 = guessNum % 10;

        if(lotteryNum==guessNum){
            System.out.println("You Won Rs 10 lakh"+"you guessed "+guessNum +" and lotter number is  "+lotteryNum);
        }else if((Ldigit1==gdigit2)&&(Ldigit2==gdigit1)){
            System.out.println("You Won Rs 5 lakh"+"you guessed "+guessNum +" and lotter number is  "+lotteryNum);

        }else if ((Ldigit1==gdigit2)||(Ldigit2==gdigit1)||(Ldigit1==gdigit1)||(Ldigit2==gdigit2)){
            System.out.println("You Won Rs 2 lakh"+"you guessed "+guessNum +" and lotter number is  "+lotteryNum);
        }else{
            System.out.println("You Won Nothing "+"you guessed "+guessNum +" and lotter number is  "+lotteryNum);
        }




    }

}
