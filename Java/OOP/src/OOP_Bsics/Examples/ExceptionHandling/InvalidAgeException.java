package OOP_Bsics.Examples.ExceptionHandling;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
