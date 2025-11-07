public class S1_Class {
    public static void main(String[] args) {


        Student raju= new Student();
        raju.name="Raju kushwhaha";
        raju.roll=10;
        raju.marks=13.5f;

        System.out.println(raju.marks);
        System.out.println(raju.name);
    }


}
class Student{
    String name;
    int roll;
    float marks;

    Student(){   // default constructor no need to code it is provided by java if we dont define any consteuctor

    }

}
