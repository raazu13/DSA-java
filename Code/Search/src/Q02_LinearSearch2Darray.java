import java.util.Arrays;

public class Q02_LinearSearch2Darray {
    public static void main(String[] args) {


        int[][] arr = {
                {1, 3, 4, 5},
                {-9, 6,},
                {8, 7, 2}
               };

        System.out.println(Arrays.toString(Search(arr, 7)));

        System.out.println(max(arr));

        System.out.println(min(arr));
    }

    static int[] Search(int[][] arr, int target){


        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target){
                    return  new int[] {row,col};

                }

            }

        }

        return new int[] {-1,-1};

    }

    //find max element
    static int max(int[][] arr){

          int max=arr[0][0];
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];

                }

            }

        }

        return max;

    }

    //using enhanced for loop
    static int min(int[][] arr){

        int min=arr[0][0];

        for(int[] a: arr){
            for(int an: a){
                if(an<min){
                    min = an;

                }
            }
        }

        return min;

    }


}
