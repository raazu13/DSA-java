//• Base class: Vehicle
//		○ Fields: brand, speed
//		○ Method: displayInfo()
//	• Derived classes: Car, Bike
//		○ Override displayInfo()
//	• Create a Main class to show method overriding.
//    🧠 Concepts: extends, constructor chaining, super keyword.


package OOP_Bsics.Examples.E3_inheritance;

public class Main {
    public static void main(String[] args) {

        Bike b=new Bike("BMW",200,2);
        b.displayInfo();

        Car c = new Car("Audi",250,4);
        c.displayInfo();

        Vehicle v= new Bike("Ducati",300,2);
//        System.out.println(v.wheel);   this field is not in vehicle callas to refer

        v.displayInfo();

    }
}
