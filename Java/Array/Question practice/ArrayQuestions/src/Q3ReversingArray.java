import java.util.Arrays;

public class Q3ReversingArray {
    public static void main(String[] args) {


        int[] array ={1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(array));

        reverse(array);

        System.out.println(Arrays.toString(array));
    }

     static void reverse(int[] array) {
        int temp;
        int start =0;
        int end = array.length-1;
        while(start<end){
//            temp=array[start];
//            array[start]=array[end];
//            array[end]=temp;

            swap(array,start,end);

            start++;
            end--;

         }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
