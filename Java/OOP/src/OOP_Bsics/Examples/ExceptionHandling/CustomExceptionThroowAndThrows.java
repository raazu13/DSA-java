//• Create InvalidAgeException → extend Exception.
//        • Create vote(int age) method that throws if age < 18.
//        🧠 Concepts: throw, throws, checked vs unchecked.

package OOP_Bsics.Examples.ExceptionHandling;

public class CustomExceptionThroowAndThrows {
    public static void main(String[] args) {

        try{
            vote(18);
        }catch (InvalidAgeException e){
            System.out.println("Custom Exception");
        }

//        vote(16);



    }

    public static void vote(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("You are not eligible to vote::::::");
        }else{
            System.out.println("You can vote....");
        }
    }
}
