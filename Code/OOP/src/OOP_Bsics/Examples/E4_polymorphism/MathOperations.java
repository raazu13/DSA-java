package OOP_Bsics.Examples.E4_polymorphism;

public class MathOperations {


    // method overloading , compile time polymorphism

    int  sum(int a,int b){
        return a+b;
    }

    double sum(double a, double b){
        return a+b;
    }

    int sum(int a,int b, int c){
        return a+b+c;
    }
}
