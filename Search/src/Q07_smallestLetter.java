// find the smallest letter that is greater than the target letter

// the letters will wrap around

public class Q07_smallestLetter {
    public static void main(String[] args) {
        char[] arr={'a','b','d','g','j','m','p','s','y'};

        char smallest=smallest(arr,'j');
        System.out.println(smallest);

    }
    public static char smallest(char[] arr, char target){
        int start =0;
        int end= arr.length-1;


        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end =mid-1;

            }else{
                start=mid+1;
            }

        }
        return arr[start%arr.length];
    }
}
