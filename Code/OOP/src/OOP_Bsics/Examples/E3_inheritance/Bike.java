package OOP_Bsics.Examples.E3_inheritance;

public class Bike extends Vehicle{
    int wheel;

    Bike(String brand, int speed, int wheel){
        super(brand,speed);
        this.wheel=wheel;
    }

    @Override
    void displayInfo() {
        System.out.println(wheel+" wheeler of "+brand+" have speed "+speed);
    }
}
