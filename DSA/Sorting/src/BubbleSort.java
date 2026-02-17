import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr={2,3,1,7,5,4,9,6};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){

        for (int i = 0; i <arr.length-1; i++) {
            boolean swap= false;
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }

            if(!swap){
                break;
            }

        }
    }
}
