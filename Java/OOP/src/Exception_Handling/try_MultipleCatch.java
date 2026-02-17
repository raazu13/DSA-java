package Exception_Handling;

public class try_MultipleCatch {
    public static void main(String[] args) {

        int[] arr= {0,1,2,3,4,5,6};

        try{
//            System.out.println(arr[1]/arr[0]);   // this prints arithemetic exception

            System.out.println(arr[20]);
        }catch (ArithmeticException e){
            System.out.println("Divide by zero : Arithemetic exception");
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Array index out of bound");
        }catch (Exception e){
            System.out.println("normal exception");
        }

        System.out.println("Program continues even after exception");
    }
}
