package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class B1_mazeProblem {
    public static void main(String[] args) {

        System.out.println(count(3,3));
        System.out.println(path("",3,3));
        printPath("",3,3);
        System.out.println(countIncludingDiagnoal(3,3));
        printPathDiagonal("",3,3);


    }


    public static int count(int r, int c){
        if(r==1 || c==1){   // we use or here bcz when we reach the row 1 we have to move right only and when we reach the coloumn 1 we have to move down only
            return 1;
        }

        int left= count(r-1,c);
        int right= count(r,c-1);

        return left+right;
    }

    public static List<String> path(String p,int r, int c){
        if(r==1 && c==1){   // we use or here bcz when we reach the row 1 we have to move right only and when we reach the coloumn 1 we have to move down only
            List<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list= new ArrayList<>();

        if(r>1){
             list.addAll(path(p + 'D', r - 1, c));

        }
        if(c>1){
            list.addAll(path(p + 'R', r, c - 1));

        }
        return list;

    }

    public static void printPath(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            printPath(p+'D',r-1,c);
        }

        if(c>1){
            printPath(p+'R',r,c-1);
        }
    }

    public static int countIncludingDiagnoal(int r, int c){
        if(r==1 || c==1){   // we use or here bcz when we reach the row 1 we have to move right only and when we reach the coloumn 1 we have to move down only
            return 1;
        }

        int left= countIncludingDiagnoal(r-1,c);
        int right= countIncludingDiagnoal(r,c-1);
        int diagonal=countIncludingDiagnoal(r-1,c-1);

        return left+right+diagonal;
    }

    public static void printPathDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            printPathDiagonal(p+'D',r-1,c);
        }

        if(c>1){
            printPathDiagonal(p+'R',r,c-1);
        }

        if(r>1 && c>1){
            printPathDiagonal(p+'d',r-1,c-1);
        }
    }
}
