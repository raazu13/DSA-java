public class Q10_searchInRotatedSortedArray {
    public static void main(String[] args) {


        int [] arr={8,10,20,3,4,7};

        System.out.println(searchRotated(arr,3));
        System.out.println(searchRotated(arr,10));
        System.out.println(searchRotated(arr,8));

        int [] nums={3,4,2,2,2,2};

        System.out.println(searchRotatedWithDuplicate(nums,4));

    }

    public static int searchRotated(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int pivot =-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if((mid<end) && (arr[mid]>arr[mid+1])){
                pivot=mid;
                break;
            }

            if((mid>start) && (arr[mid-1]>arr[mid])){
                pivot=mid-1;
                break;
            }

            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        if(pivot== -1){
            return binarySearch(0,arr.length-1,arr,target);
        }

        if(arr[pivot]==target){
            return pivot;
        }

        if(arr[0]>target){
            return binarySearch(pivot+1, arr.length-1, arr,target);
        }

        return binarySearch(0,pivot,arr,target);


    }

    public static int binarySearch(int start, int end, int[] arr,int target){

        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }

        return -1;
    }
    public static int searchRotatedWithDuplicate(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int pivot =-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if((mid<end) && (arr[mid]>arr[mid+1])){
                pivot=mid;
                break;
            }

            if((mid>start) && (arr[mid-1]>arr[mid])){
                pivot=mid-1;
                break;
            }

            if((arr[start]==arr[mid])&& (arr[mid]==arr[end])){

                if((start<end) &&(arr[start]>arr[start+1])){
                    pivot = start;
                    break;
                }
                start++;

                if(end>start && arr[end]<arr[end-1]){
                    pivot = end-1;
                    break;
                }

                end--;
            }
            if((arr[start]<arr[mid]) ||(arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        if(pivot== -1){
            return binarySearch(0,arr.length-1,arr,target);
        }

        if(arr[pivot]==target){
            return pivot;
        }

        if(arr[0]>target){
            return binarySearch(pivot+1, arr.length-1, arr,target);
        }

        return binarySearch(0,pivot,arr,target);


    }


}
