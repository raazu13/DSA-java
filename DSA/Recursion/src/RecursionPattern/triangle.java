package RecursionPattern;

public class triangle {
    public static void main(String[] args) {

        triangle(4,0);
        System.out.println();
        triangle2(0,0);

    }

    public static void triangle(int row ,int col){

        if(row==0){
            return;
        }
    if(col<row){
        System.out.print("* ");
        triangle(row,col+1);
    }else{
        System.out.println();
        triangle(row-1,0);
    }

    }

    public static void triangle2(int r,int c){
        if(r==4){
            return;
        }

        if(c<=r){
            System.out.print("* ");
            triangle2(r,c+1);
        }else{
            System.out.println();
            triangle2(r+1,0);
        }
    }
}
