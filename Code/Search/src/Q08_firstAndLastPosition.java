import java.util.Arrays;

//first and last position of target element in sorted array
public class Q08_firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,7,7,7,7,8,8,8,9,10};

        System.out.println(Arrays.toString(position(arr,7)));

    }
    public static int[] position(int[] arr, int target){

        int[] ans ={-1,-1};

          int start= index(arr,target,true);
          int end = index(arr,target,false);

          ans[0]=start;
          ans[1]=end;

        return ans;
    }

    static int index(int[] arr,int target ,boolean isStart){
         int ans=-1;

        int start =0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end =mid-1;

            }else if(target>arr[mid]){
                start=mid+1;
            }
            else{

                ans=mid;  //potential ans
                 if(isStart){
                     end=mid-1;
                 }else{
                     start=mid+1;
                 }
            }
        }


        return ans;

    }
}
