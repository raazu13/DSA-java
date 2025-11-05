// program to calculate sum of elemnts of array and then find its average
import java.util.Arrays;
import java.util.Scanner;

public class Q4SumNaverage {
    public static void main(String[] args) {

        int[] arr = new int[8];
        input(arr);

        System.out.println( Arrays.toString(arr));
        System.out.println("The sum of the elements of givn array is :"+ Sum(arr));
        System.out.println("The average of the Elements is: " +Average(arr));



    }
    // function to take inputs of array
    static void input(int[] array){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter " + array.length + " elements :");
        for (int i = 0; i < array.length; i++) {
            array[i]=in.nextInt();

        }
    }

    // function to calculate sum
    static int Sum(int[] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];

        }

        return sum;
    }


    //Function to return average
    static double Average(int[] array){
        return (double) Sum(array)/ array.length;
    }

}
