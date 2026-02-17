import java.util.Scanner;
public class toCheckArmstr0ng {
    public static void main(String[] args) {
        //to print all 3 digits armstrong number


        System.out.println("The 3 digits Armstrong number are:");
        for(int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

        Scanner num = new Scanner(System.in);


       System.out.print("ENter the number to check If its Armstrong:");
        int n = num.nextInt();
        num.close();


         if(isArmstrong(n)){
            System.out.println("the number is Armstrong number");
        }else {
            System.out.println("the number is  not Armstrong number");
        }





    }

    static boolean isArmstrong(int original) {
        int count=0;
        int result=0;
        int remainder;
        int n = original;
         while(n!=0){
            n= n/10;
           count= count + 1;

         }

         n= original;
         while(n!=0){
             remainder= n%10;

             result += Math.pow(remainder, count);
             n=n/10;

         }


    return result == original;
    }
}
