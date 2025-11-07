package RecursionSort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        int[] arr={1,2,4,3,8,5,10,0};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr,int end ,int index){

        if(end==0){
            return;
        }
        if(index<end){
             if(arr[index]>arr[index+1]){
                 int temp=arr[index];
                 arr[index]=arr[index+1];
                 arr[index+1]=temp;
             }
            bubbleSort(arr,end,index+1);
        }else{

            bubbleSort(arr,end-1,0);
        }

    }
}
