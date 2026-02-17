package BackTracking;

public class B2_mazeWithObstacle {
    public static void main(String[] args) {

        System.out.println(count(0,0));
        printPath("",0,0);
    }
    public static int count(int r, int c){
        if(r==1 && c==1){
            return 0;
        }

        if(r==2 || c==2){   // we use or here bcz when we reach the row 1 we have to move right only and when we reach the coloumn 1 we have to move down only
            return 1;
        }

        int left= count(r+1,c);
        int right= count(r,c+1);

        return left+right;
    }

    public static void printPath(String p, int r, int c){
       if(r==1 && c==1) {   //Assuming (1,1) as restriction , we can also pass the restriction using boolean matrix like
           return;                // boolean [][] board = {
       }                  //                        {true,true,true},
                           //                        {true,true,true},
                           //                        {true,true,true}
                          //                        }



        if(r==2 && c==2){
            System.out.println(p);
            return;
        }

        if(r<2){
            printPath(p+'D',r+1,c);
        }

        if(c<2){
            printPath(p+'R',r,c+1);
        }
    }
}
