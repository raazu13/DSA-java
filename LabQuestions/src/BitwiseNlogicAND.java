import java.sql.SQLOutput;

public class BitwiseNlogicAND {
    public static void main(String[] args) {


        //demonstaration of bitwise and
        int a=3;
        int b=2;
        int c= a&b;

        System.out.println("The binary of a is "+Integer.toBinaryString(a)+"and of b is "+Integer.toBinaryString(b));
        System.out.println("The binary of c is "+Integer.toBinaryString(c));
        System.out.println("hence a & b ="+c);

        if(checkFirst() && checkSecond()){
            System.out.println("over all condition is true");
        }
        else{
            System.out.println("overall conditon is false");
        }

        if(checkFirst() &checkSecond()){
            System.out.println("over all condition is true");
        }
        else{
            System.out.println("overall conditon is false");
        }


    }
    static boolean checkFirst(){
        System.out.println("The first condition is being evaluated !!");
        return false;
    }

    static boolean checkSecond(){
        System.out.println("The Second condition is being evaluated !!");
        return true;
    }

}
