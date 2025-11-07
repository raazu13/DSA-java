import java.util.Arrays;

public class Q2maxAnMinElement {
    public static void main(String[] args) {

        int[] arr= {2,34,56,67,100,0,32,58};

       int max= getMax(arr);  // max element of the array
        System.out.println(Arrays.toString(arr));
        System.out.println("The max element is :"+max);

        // get the max element between index 0 and 3;

        System.out.println("Max element between index 0 and 3 is :"+getRAnge(arr, 0, 3));

        System.out.println("The min element is :"+getmin(arr));

    }

    // function to find max element of the array
    static int getMax(int[] arr) {
        if(arr.length==0){
            return -1;
        }

        if(arr==null){    //edge cases
            return -1;
        }

        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }

        return max;
    }

    //function to find max in the given range of index
    static int getRAnge(int[] arr, int start, int end) {

        if (start>end){               //edge cases
            return -1;
        }
        int max=arr[start];
        for (int i = start; i <=end ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }

        return max;
    }

    static int getmin(int[] array){
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if(min>array[i]){
                min = array[i];
            }

        }

        return min;
    }

}
