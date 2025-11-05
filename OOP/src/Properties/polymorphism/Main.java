package Properties.polymorphism;

public class Main {

    public static void main(String[] args) {

        Calculator sum= new Calculator();

        sum.sum();
        sum.sum(2,3,4);
        sum.sum(2,3);


        Calculator sum1= new Calculator(1,2,3);
        sum1.sum();
    }
}
