import java.util.Arrays;
import java.util.Scanner;

public class Q6countOccurence {
    public static void main(String[] args) {
        int[] array = new int[5];

        input(array);

        System.out.println(Arrays.toString(array));

        System.out.println("The given element is occuring :"+occurence(array,3)+" times !!");





    }

    //function to count occurence of a given element
    static int occurence(int[] array, int element){
        int occ=0;

        for (int i = 0; i <array.length ; i++) {
            if(array[i]==element){
                occ++;
            }

        }

        return occ;
    }


    //Function to take input frm users
    static void input(int[] array){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter " + array.length + " elements :");
        for (int i = 0; i < array.length; i++) {
            array[i]=in.nextInt();

        }
    }
}
