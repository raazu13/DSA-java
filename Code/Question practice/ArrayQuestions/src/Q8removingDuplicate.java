import java.util.ArrayList;
import java.util.Arrays;

public class Q8removingDuplicate {
    public static void main(String[] args) {
        int[] sorted = {1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9};
        System.out.println(Arrays.toString(sorted));

        int[] newa= removeDuplicate(sorted);

        System.out.println(Arrays.toString(newa));


    }

    // function to remove duplicate elements
    static int[] removeDuplicate(int[] arr) {
        if(arr.length==0){
            return arr;
        }

        ArrayList<Integer> naya = new ArrayList<>();
        naya.add(arr[0]);

        for (int i = 1; i <arr.length; i++) {
            if(arr[i] != arr[i-1]){
                naya.add(arr[i]);
            }

        }


        int[] sorted = new int[naya.size()];

        for (int i = 0; i <naya.size() ; i++) {
            sorted[i] = naya.get(i);

        }

        return sorted;

    }

    //without using extra array learn this later
    static int change(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int j=0;
        
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] != arr[0]){
                j++;
                arr[j]=arr[i];

            }

        }

        return 0;
    }
}
