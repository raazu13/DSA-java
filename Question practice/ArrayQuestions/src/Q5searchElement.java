import java.util.Scanner;

public class Q5searchElement {
    public static void main(String[] args) {
        int[] array = new int[5];

        input(array);
        search(array,5);



    }
    //to search the element in given array
    static void search(int[] array, int element){

        for (int i = 0; i <array.length ; i++) {
            if(array[i]==element){
                System.out.println("Element "+element+ " found at Index: "+i);
                break;
            }

        }
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
