package AbstractAndInterface.Abstract;

public abstract class Car {

    int a;
    static int b;


    // this constructor is not used to make object of Car but is used by its sub class
    Car(){
        this.a=10;
        Car.b=20;
    }

    void intro(){
        System.out.println("I am a Car");
    }

   abstract void start();
   abstract void brake();
   abstract  void accelerate();

}


