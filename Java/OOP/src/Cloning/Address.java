package Cloning;

public class Address implements Cloneable{
    String address;

    Address(String address){
        this.address=address;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
