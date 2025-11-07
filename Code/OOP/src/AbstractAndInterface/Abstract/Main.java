package AbstractAndInterface.Abstract;

public class Main {
    public static void main(String[] args) {

        BMW b= new BMW();
        b.start();
        b.brake();
        b.intro();

        Car c= new BMW();
        c.accelerate();
        c.brake();
//        System.out.println(c.d);  it cannot be resolved as it is not in abstract class and nothing in reference variable can refer it

        System.out.println(c.a);
        System.out.println(Car.b);
    }
}
