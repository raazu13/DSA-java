package Exception_Handling;

public class Throw {
    public static void main(String[] args) {

        int a=90;
        int b=1;
        int c=0;

//        if(b==1){
//            throw new ArithmeticException("cant divide by 1");  // throwing exception manually
//        }
//
//        System.out.println(a/b);

        try {
            divide(a,c);
        }catch (Exception e){
            System.out.println("Arithemetic exception");
        }

//        divide(2,3);   // to implement this user must use try catch

    }


    public static void divide (int a, int b) throws Exception{
    if(b==0){
        throw new Exception("Divide by zero");
    }
        System.out.println(a/b);
    }
}
