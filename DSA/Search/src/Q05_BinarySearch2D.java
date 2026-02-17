import java.util.Arrays;

public class Q05_BinarySearch2D {
    public static void main(String[] args) {

        int [][] arr={      ///  this is row ordered and column ordered matrix where row and column in itself is sorted
                {2,4,6,10},
                {7,8,12,14},
                {9,11,13,15}

        };
        System.out.println(Arrays.toString(search(arr,6)));


        int[][] matrix ={   // this is sorted matrix like 1d array where first element of next row is always greater than previous row
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}


        };

        System.out.println(Arrays.toString(search2d(matrix,16)));  // printing  by considring as 1d array

        System.out.println(Arrays.toString(searchOrderedMatrix(matrix,16)));

    }

    // row column sorted matrix
    static int[] search(int[][] matrix, int target){
        int row=0;
        int col=matrix[0].length-1;

         while(row< matrix.length && col>=0){  // boundary between first raw first column and last column
             if(matrix[row][col]==target){        // here last element of first column is being checked that is last column
                 return new int[] {row,col};
             }
             else if(matrix[row][col]<target){
                 row++;                           // if target is greater we move to next row

             }else {
                 col--;                          // if target is less we ignore the last column
             }
         }

        return new int[] {-1,-1};
    }

    //BS by considering 2d array as 1d array
    static int[] search2d(int[][] arr, int target){
        int row=arr.length;
        int col = arr[0].length;           // here we need no. of rows and columns to get total number of elements

        int low = 0, high=(row*col)-1;      // here we set the boundary for traversal

        while(low<=high){                        // set the condition
            int mid = low + (high-low)/2;          // this gve us the mid to find the element at mid using below logic

            int r= mid/col;                   // using this we get the middle element
            int c= mid%col;

            if(target==arr[r][c]){
                return new int[] {r,c};
            }else if(target < arr[r][c]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return new int[] {-1,-1};
    }

    //finding the element bala row then applying binary search there
    static int[] searchOrderedMatrix(int[][] arr, int target){

        int rows =arr.length;
        int col = arr[0].length;

        int top = 0;   // this is to traverse the row
        int bottom =rows-1;

        int row = -1;  //setting this for false condition



        while(top<=bottom){    // this is to find the row with target element
            int mid = (top+bottom)/2;

            if(arr[mid][0]<=target && target<= arr[mid][col-1]){    // here checking within the mid rowb bb
                row = mid;
                break;
            }else if(arr[mid][0]>target){
                bottom=mid-1;
            }else{
                top = mid+1;
            }
        }

        if(row==-1){
            return new int[] {-1,-1};
        }
        return binarySearch(arr, row, target );





    }

    static int[] binarySearch(int[][] arr, int row, int target){

        int start = 0;
        int end = arr[0].length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[row][mid]==target){
                return new int[] {row,mid};
            }else if(arr[row][mid]<target){
                start = mid+1;

            }else{
                end = mid-1;
            }

        }




        return new int[] {-1,-1};
    }

}
