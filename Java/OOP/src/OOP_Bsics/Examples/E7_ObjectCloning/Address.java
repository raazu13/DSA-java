package OOP_Bsics.Examples.E7_ObjectCloning;

public class Address {

    String address;
    Address(String address){
        this.address=address;
    }

    Address(Address address){
        this.address=address.address;
    }
}
