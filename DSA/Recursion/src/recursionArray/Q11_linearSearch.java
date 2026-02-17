package recursionArray;

public class Q11_linearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,7,9,10,56};
        System.out.println(linearSearch(arr,5,0));
    }
    static int linearSearch(int[]arr , int target, int index){
        if(index==arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }else{
            return linearSearch(arr,target,index+1);
        }


    }
}
