package VehicleManagement;

public class Bike extends Vehicle{

    Bike(){
        super();
    }

    Bike(String brand, int engine,int price){
        super(brand,engine,price);
    }

    @Override
    public String toString(){
        return "Bike { Brand:"+brand+" engine:"+ engine +" price: "+price+" }";
    }
}
