package OOP_Bsics.Examples.E7_ObjectCloning;

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
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();   // for shallow copy we can use clonable and call super.clone()
    }

    protected Object deepClone() throws CloneNotSupportedException{
        // Create a new Address object (new reference)
//        Address newAddress = new Address(this.address.address);
//        return new Student(this.age, this.name, newAddress);
        Student s= (Student) super.clone();
        s.address=new Address(this.address.address);   // for deep copy we must copy manually
        return s;
    }

//    public String toString() {
//        return "Student{age=" + age + ", name='" + name + "', city='" + address.address + "'}";
//    }

    public String toString(){
        return age+"";
    }
}
