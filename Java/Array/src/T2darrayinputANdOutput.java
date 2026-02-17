import java.util.Arrays;
import java.util.Scanner;

public class T2darrayinputANdOutput {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int[][] arr= new int[3][4];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]= input.nextInt();

            }

        }

        input.close();

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]+" ");

            }
            System.out.println();

        }

        for (int row = 0; row <arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }

        for(int[] a: arr){    // enhanced for loop
            System.out.println(Arrays.toString(a));
        }



    }
}
