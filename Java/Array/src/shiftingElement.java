import java.util.Arrays;

public class shiftingElement {
    public static void main(String[] args) {


        int [] arr= {1,2,3,4,5,6,7,8,9};
        for (int i=1; i<3; i++){
            shifting(arr);
        }

        System.out.println(Arrays.toString(arr));

    }
    static void shifting(int[] arr){
        int temp=arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }

        arr[arr.length-1]=temp;
    }
}
