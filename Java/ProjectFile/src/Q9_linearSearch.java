public class Q9_linearSearch {
    public static void main(String[] args) {


        int[] arr={1,2,4,5,8,9,10};
        int target=8;
        int indexOftarget=linearSearch(arr,target);

        System.out.println("The target found at: "+indexOftarget);
    }

    public static int linearSearch(int[] arr, int target){

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
