package AbstractAndInterface.Abstract;

public class BMW extends Car{

    int d;

    BMW(){
        super();
        this.d=10;
    }
    @Override
    void start() {
        System.out.println("BMW started");
    }

    @Override
    void brake() {
        System.out.println("Brake applied to BMW");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerated BMW");
    }
}
