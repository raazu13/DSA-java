package VehicleManagement;

public class Vehicle {
    int engine;
    String brand;
    float price;

    Vehicle(){
        this.engine =0;
        this.brand=null;
        this.price=0;
    }

    Vehicle(String brand, int engine, int price){
        this.engine =engine;
        this.brand=brand;
        this.price=price;
    }

    @Override
     public String toString(){
        return "Vehicle { Brand:"+brand+" engine:"+ engine +" price:"+price+" }";
     }

}
