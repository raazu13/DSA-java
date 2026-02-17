package OOP_Bsics.Examples.E3_inheritance;

public class Car extends Vehicle{
    int wheel;

    Car(String brand, int speed, int wheel){
        super(brand,speed);
        this.wheel=wheel;
    }

    @Override
    void displayInfo() {
        System.out.println(wheel+" wheeler of "+brand+" have speed "+speed);
    }
}
