package recursionArray;

public class Q10_toCheckIfsortedArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,5,5,8,7,8};

        System.out.println(isSorte(arr,0));

    }

    static boolean isSorte(int[] arr,int  start){
        if(start==arr.length-1){
            return true;
        }

        if(arr[start]<=arr[start+1]){
            return isSorte(arr,start+1);
        }else{
            return false;
        }
    }
}
