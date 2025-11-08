package Cloning;

public class Student implements Cloneable{
    int age;
    String name;
    Address address;

    Student(int age, String name,Address address){
        this.age=age;
        this.name=name;
        this.address=address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{            // here the object is type of data as it is not sure what we have to use
         Student s= (Student) super.clone();
         s.address= (Address) address.clone();   // here if we dont do cloning explicitly it will do shallow cloning
        return  s;
    }
}
