package BackTracking;

public class B3_backtrackingAllpath {
    public static void main(String[] args) {
     boolean[][] maze={
             {true,true,true},
             {true,true,true},
             {true,true,true}
                              };

     backtrackingPath("",0,0,maze);

    }

    public static  void backtrackingPath(String p, int r, int c, boolean [][] maze){

        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c]=false;

        if(r< maze.length-1){
            backtrackingPath(p+'D',r+1,c,maze);
        }

        if(c<maze[0].length-1){
            backtrackingPath(p+'R',r,c+1,maze);
        }
        if(r>0){
            backtrackingPath(p+'U',r-1,c,maze);
        }

        if(c>0){
            backtrackingPath(p+'L',r,c-1,maze);
        }

        maze[r][c]=true;
    }
}
