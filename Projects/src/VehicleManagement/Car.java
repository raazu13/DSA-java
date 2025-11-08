package VehicleManagement;

public class Car extends Vehicle{

    Car(){
        super();
    }

    Car(String brand, int engine,int price){
        super(brand,engine,price);
    }

    @Override
    public String toString(){
        return "Car { Brand: "+brand+" engine in cc:"+ engine +" wheeler price: "+price+" }";
    }
}
