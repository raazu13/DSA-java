package RecursionSort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

        int[] arr={1,2,4,3,8,5,10,0};
        selectionSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr,int end ,int index,int max){

        if(end==0){
            return;
        }
        if(index<=end){
            if(arr[index]>arr[max]){

            selectionSort(arr,end,index+1,index);
        }else{

            selectionSort(arr,end,index+1,max);
        }

    }else{
            int temp=arr[max];
            arr[max]=arr[end];
            arr[end]=temp;
            selectionSort(arr,end-1,0,0);
        }
}

}
