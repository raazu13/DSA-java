public class Q03_BS1binarySearch {
    public static void main(String[] args) {

        int[] arr={-100,-1,0,1,2,3,4,5,6,8,9,10,100};


        System.out.println(index(arr,4));

    }
    static int index(int[] arr,int target ){

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
                return mid;
            }
        }
        return -1;

    }

}
