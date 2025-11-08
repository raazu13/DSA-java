package VehicleManagement;

public class Truck extends Vehicle{

    Truck(){
        super();
    }

    Truck(String brand, int engine,int price){
        super(brand,engine,price);
    }

    @Override
    public String toString(){
        return "Truck { Brand:"+brand+" engine:"+ engine +"  price:"+price+" }";
    }

}
