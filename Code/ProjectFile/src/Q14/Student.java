package Q14;

public class Student {

    String name;
    int roll;

    Student(){
        this("Raju",2334);
    }

    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
        System.out.println(name+"'s Roll is "+roll);
    }
}
