//“Vehicle Management System”
//Concepts Used: Inheritance, Polymorphism, Collections

//Tasks:
//        • Create Vehicle → subclasses Car, Truck, Bike
//	• Add ArrayList<Vehicle> to store them.
//	• Add method to display all vehicles.
//        • Use method overriding for unique info printing.
//🧩 Bonus: Sort vehicles by price using Comparator.


package VehicleManagement;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicle= new ArrayList<>();

        Scanner in=new Scanner(System.in);
        int choice;

        System.out.println("VEHICLE MANAGEMENT SYSTEM !!!");
        do{
            System.out.print("\nWhat you want to do ?\n1. Add vehicle\n2. Display Vehicle\n3. Exit\nEnter your choice here:");
             choice = in.nextInt();

             switch(choice){

                 case 1:
                     System.out.print("Enter what you want to add: \n1.CAR\n2.Bike\n3.Truck\nEnter your choice: ");
                     int type= in.nextInt();
                     System.out.print("\nEnter the price: ");
                     int price=in.nextInt();
                     System.out.print("\nEnter the brand: ");
                     String brand=in.next();
                     System.out.print("\nEnter the power of engine in cc: ");
                     int engine=in.nextInt();


                     if(type==1) {
                         vehicle.add(new Car(brand, engine, price));
                     }else if(type==2){
                         vehicle.add(new Bike(brand,engine, price));
                     }else{
                         vehicle.add(new Truck(brand, engine, price));
                     }

                     System.out.println("\nVhicle added successfully");
                     break;

                 case 2:

                     System.out.println("\nYou have following vehicles: ");
                     for (Vehicle v:vehicle){
                         System.out.println("\n"+v.toString());
                     }

                     break;

                 default:
                     break;
             }

        }while(choice != 3);
    }
}
