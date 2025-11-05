import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        int ans;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the operation you want to perform !!!:");

            char operaation = input.next().charAt(0);

            System.out.print("Enter two numbers:");
            int a= input.nextInt();
            int b= input.nextInt();

            input.close();

            switch (operaation) {
                case '+':
                    ans = a + b;
                    System.out.println(ans);
                    break;
                case '-':
                    ans = a - b;
                    System.out.println(ans);
                    break;
                case '*':
                    ans = a * b;
                    System.out.println(ans);
                    break;
                case '/':
                    ans = a / b;
                    System.out.println(ans);
                    break;
                case '%':
                    ans = a % b;
                    System.out.println(ans);
                    break;
                default:
                    System.out.println("invalid input!!!");
                    break;
            

            }


        }



    }

