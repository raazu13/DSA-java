package BackTracking;

import java.util.Arrays;

public class B5_NQueens {
    public static void main(String[] args) {

        boolean [][] board= new boolean[4][4];
        System.out.println(queen(board,0));

    }

    public static int queen(boolean[][] board, int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count =0;

        for(int i=0; i<=board[0].length-1; i++){
            if(isSafe(board,row,i)) {
                board[row][i] = true;
               count+= queen(board, row + 1);
                board[row][i]=false;
            }
        }

        return count;
    }

    public static boolean isSafe(boolean[][] board,int r, int c){

        // vertical check
        for(int i=r; i>=0; i--){
            if(board[i][c]){
                return false;
            }
        }




        // left diagonal check
        for(int i=r, j=c; i>=0 && j>=0; i--,j-- ){
            if(board[i][j]){
                return false;
            }
        }

        // for right diagonal

        for(int i=r,j=c; i>=0 && j<board[0].length; i--,j++){
            if(board[i][j]){
                return false;
            }
        }

        return true;
    }

    public static void display(boolean[][] board){
        for(boolean[] row:board){
             for(boolean element:row){
                 if(element==true) {
                     System.out.print("Q ");
                 }else{
                     System.out.print("X ");
                 }
             }
            System.out.println();
        }
    }
}
