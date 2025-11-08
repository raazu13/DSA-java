package OOP_Bsics.Examples.E5_abstarctionAndInterface;

public class Rectangle extends Shape{
    float l;
    float b;

    Rectangle(float l, float b){
        this.l=l;
        this.b=b;
    }

    @Override
    void area() {
        System.out.println("The area of Rectangle is: "+l*b);
    }
}
