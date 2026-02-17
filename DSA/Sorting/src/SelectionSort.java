import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr={2,1,6,4,9,10,5,20,15};

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr ){
        for (int i = 0; i <arr.length; i++) {
             int last= arr.length-i-1;
             int max= max(arr,0,last);
             swap(arr,last,max);
        }

        }

        static void swap(int[] arr, int start, int end){

        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;

        }

        static int max(int[] arr, int start, int end){
        int max=start;

            for (int i = 0; i <=end ; i++) {

                if(arr[i]>arr[max]){
                    max=i;
                }

            }

            return max;
        }

}
