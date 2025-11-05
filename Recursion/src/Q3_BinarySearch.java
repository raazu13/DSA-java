public class Q3_BinarySearch {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8};

        int ans=binarySerch(arr,5,0,arr.length);
        System.out.println(ans);
    }
    static int binarySerch(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]<target){
            return binarySerch(arr,target,mid+1,end);
        }

        return binarySerch(arr,target,start,mid-1);

    }
}
