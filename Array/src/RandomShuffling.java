import java.util.Arrays;

public class RandomShuffling {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};

        shuffle(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void shuffle(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            int index= (int)(Math.random()*(arr.length));

            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

    }
}
