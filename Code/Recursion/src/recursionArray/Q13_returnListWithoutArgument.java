package recursionArray;

import java.util.ArrayList;

public class Q13_returnListWithoutArgument {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,7,5,9,10,5,56};
        System.out.println(linearSearchMultiple(arr,5,0));
    }
    static ArrayList<Integer> linearSearchMultiple(int[]arr , int target, int index){

        ArrayList<Integer> list=new ArrayList<>();

        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add( index);
        }
        ArrayList<Integer> ans= linearSearchMultiple(arr,target,index+1);
     list.addAll(ans);

     return list;


    }
}
