import java.util.Arrays;

public class Q1Swapping {
    public static void main(String[] args) {


        int[] array= {1,2,3,4,5,6,7};
        System.out.println("Array before swapping:" +Arrays.toString(array));

        //swaping two elements of array when index of the element is given
        //do using function creating temporary variable

        swap(array, 1 ,2);
        System.out.println("Arrays after swapping the index 1 and 2 :" +Arrays.toString(array));

    }

    //function to swap elemnts of given index
    static void swap(int[] arr, int index1, int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}