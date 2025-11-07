public class Q09_searchInInfiniteSortedArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10,12,14,15};
         int ans = ans(arr,8);
        System.out.println(ans);

    }

    static int ans(int[] arr, int target){
        int start=0;
        int end=1;

        while(arr[end]<target){

            int newStart=end+1;

            end = end+(end-start+1)*2;
            start=newStart;
        }

        return index(arr,target,start,end);
    }
    static int index(int[] arr,int target ,int start, int end){


        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }else if (target<arr[mid]) {
                end =mid-1;

            }else {
                start=mid+1;
            }

        }
        return -1;

    }
}
