import java.util.Arrays;
import java.util.Scanner;

public class Q7rotateAnArray {
    public static void main(String[] args) {

        int[] array = new int[9];
        input(array);
        System.out.println(Arrays.toString(array));
        rotate(array,1);
        System.out.println(Arrays.toString(array));

        Rotate(array,2);
        System.out.println(Arrays.toString(array));

        leftrotate(array,3);
        System.out.println(Arrays.toString(array));

        left(array,4);
        System.out.println(Arrays.toString(array));

        //rotation can be done using reverse function and shifting method by initializing from last as it will not affect the other elements
         // there is also other method using another array and storing back into the original array
    }


    //Function to take input frm users
    static void input(int[] array){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter " + array.length + " elements :");
        for (int i = 0; i < array.length; i++) {
            array[i]=in.nextInt();


        }
    }

    //function to rotate an array by certain steps
    static void reverse(int[] array,int start, int end) {
        int temp;

        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;


            start++;
            end--;

        }
    }

        // function to rotate right
        static void rotate( int[] arr,int k){

            reverse(arr,0, arr.length-1);
            reverse(arr,0,k-1);
            reverse(arr, k,arr.length-1);

        }
        
        //function to rotate right without using reverse function
    
    
    static void Rotate(int[] arr , int k){

        for (int j = 0; j <k ; j++) {


        int last = arr[arr.length-1];

        for (int i =arr.length-1; i >0; i--) {
            arr[i]=arr[i-1];


        }
        arr[0]=last;

        }
    }

    //function to rotate left using reverse function
    static void leftrotate(int[] arr, int k){
        k=k%arr.length;

        reverse(arr,0,k-1);
        reverse(arr,k, arr.length-1);
        reverse(arr,0, arr.length-1);

    }

    //function to rotate left using shifting
    static void left(int[] arr , int k){

        for (int j = 0; j <k ; j++) {


            int first = arr[0];

            for (int i =0; i < arr.length-1; i++) {
                arr[i]=arr[i+1];


            }
            arr[arr.length-1]=first;

        }
    }


    
    
}





