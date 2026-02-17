//• Divide two numbers using try-catch.
//        • Handle multiple exceptions: ArithmeticException, ArrayIndexOutOfBoundsException.
//	• Add finally block to print “Program finished.”

package OOP_Bsics.Examples.ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        int[] arr={0,1,2,3,4};

        try{

            divide(arr[1],arr[20]);
//            divide(1,0);    // this will give arithemetic exception
        }catch (ArithmeticException e){
            System.out.println("Arithemetic exception");
        }catch(ArrayIndexOutOfBoundsException i){
            System.out.println("Array index out of bound ");
        }catch(Exception e){
            System.out.println("Other exception");
        }finally {
            System.out.println("finally program finished");
        }



    }

    public static int divide(int a, int b){


        return a/b;
    }

}
