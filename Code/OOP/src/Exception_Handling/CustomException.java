package Exception_Handling;

public class CustomException extends Exception{

    CustomException(String message){
        super(message);
    }
}

class Main{
    public static void main(String[] args) {

        try{
             sum(1,0);
        }catch (CustomException s){
            System.out.println(s.getMessage());
        }
    }

    public static void sum(int a, int b) throws CustomException{
        if(b==0){
            throw new CustomException("This is demo message");
        }
        System.out.println(a+b);
    }
        }
