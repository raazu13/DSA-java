package BackTracking;

public class B6_NKnights {
    public static void main(String[] args) {

        int n=4;
        boolean[][] board= new boolean[n][n];

        System.out.println(knight(board,0,0,4));
    }

    public static int knight(boolean [][] board, int r, int c, int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return 1;
        }

        int count=0;
        if(r==board.length-1 && c== board.length){
            return 0;
        }

        if(c==board.length){
           return knight(board,r+1,0,knights);

        }

        if(issafe(board,r,c)) {
            board[r][c] = true;
            count+=knight(board, r, c + 1, knights - 1);
            board[r][c] = false;
        }

        count+=knight(board, r, c + 1, knights);

        return count;


    }

    public static boolean issafe(boolean[][] board, int r, int c){
        if(isValid(board,r-2,c+1)){
            if(board[r-2][c+1]){
                return false;
            }
        }

        if(isValid(board,r-2,c-1)){
            if(board[r-2][c-1]){
                return false;
            }
        }

        if(isValid(board,r-1,c+2)){
            if(board[r-1][c+2]){
                return false;
            }
        }

        if(isValid(board,r-1,c-2)){
            if(board[r-1][c-2]){
                return false;
            }
        }

        return true;
    }

    public static boolean isValid(boolean[][] board, int r, int c){
        if(r>=0 && c>=0 && r<board.length && c< board[0].length){
            return true;
        }

        return false;
    }


    public static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element==true) {
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
