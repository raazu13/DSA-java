package AbstractAndInterface.Interface;

public interface CDplayer {

    final static int a=10;   // in interface we dont need to implement static or final as it is default in it

     static void check(){
         System.out.println("to check if we can add static methods in interface");
     }

    default void run(){
        System.out.println("we can add default method tomextend interface");
    }
    void start();
    void stop();

}
