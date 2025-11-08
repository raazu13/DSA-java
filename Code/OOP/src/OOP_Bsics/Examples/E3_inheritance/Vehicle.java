package OOP_Bsics.Examples.E3_inheritance;

public class Vehicle {
    String brand;
    int speed;

    Vehicle(){
        this("BMW",200);
    }

    Vehicle(String name, int speed){
      this.brand=name;
      this.speed=speed;
    }

    void displayInfo(){
        System.out.println(brand+" have speed "+speed);
    }
}
