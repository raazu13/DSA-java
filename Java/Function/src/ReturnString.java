public class ReturnString {
    public static void main(String[] args){

        String message= Mygreet("Raju") ;
        System.out.println(message);

    }
    //  function returning String
    static String Mygreet(String name){


        return "hello !! " +name;
    }

}
