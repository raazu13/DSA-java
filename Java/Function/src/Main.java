import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        sum();

    }
    // function to enter and display its sum
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int x= input.nextInt();
        System.out.println("Enter the number 2:");
        int y= input.nextInt();

        int Sum= x+y;
        System.out.println("The sum is :"+Sum);

    }
}