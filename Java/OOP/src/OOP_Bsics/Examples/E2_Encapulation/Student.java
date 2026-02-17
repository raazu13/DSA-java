package OOP_Bsics.Examples.E2_Encapulation;

public class Student {
    private int age;
    private int marks;
    private String name;

    Student(int age, int marks,String name){
        this.age=age;
        this.name=name;
        this.marks=marks;
    }

    public int getAge(){
        return age;
    }
    public int getMarks(){
        return marks;
    }
    public String name(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
