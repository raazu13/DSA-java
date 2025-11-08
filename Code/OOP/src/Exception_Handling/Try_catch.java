package Exception_Handling;

public class Try_catch {
    public static void main(String[] args) {

        int a=5;
        int b=0;

        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println("divide by zero");
        }

        System.out.println("program continues");
    }
}
