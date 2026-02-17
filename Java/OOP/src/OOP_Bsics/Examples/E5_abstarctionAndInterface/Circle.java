package OOP_Bsics.Examples.E5_abstarctionAndInterface;

public class Circle extends Shape{

    float radius;

    Circle(float radius){
        this.radius=radius;
    }

    @Override
    void area() {
        System.out.println("The area of Circle is :"+3.14*radius*radius);
    }
}
