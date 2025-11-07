package recursionArray;

import java.util.ArrayList;

public class Q12_linearSearchMultipleOcurrence {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,7,5,9,10,56};
        System.out.println(linearSearchMultiple(arr,5,0,new ArrayList<>()));
    }
    static ArrayList<Integer> linearSearchMultiple(int[]arr , int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add( index);
        }
        return linearSearchMultiple(arr,target,index+1,list);



    }
}
