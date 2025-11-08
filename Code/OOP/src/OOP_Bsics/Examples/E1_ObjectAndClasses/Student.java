package OOP_Bsics.Examples.E1_ObjectAndClasses;

public class Student {
    int age;
    int roll;
    String name;

    Student(){
       this(10,0,"Madharchod");
    }

    Student(int age, int roll, String name){
        this.name=name;
        this.age=age;
        this.roll=roll;
    }

    @Override
    public String toString(){
        return "Student{ name="+name+" roll="+roll+" age="+age+"}";
    }
}
