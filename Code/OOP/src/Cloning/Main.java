package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

//
//        Address add= new Address("kathmandu");
//        Student s1= new Student(12,"Raju",add);
//        Student s2= (Student) s1.clone();
//
//        System.out.println(s1.address.address);
//        System.out.println(s2.address.address);
//        s1.address.address="pokhara";
//
//        System.out.println(s2.address.address);  // here changing one have changed both the addresses


//        System.out.println(s1==s2);
//        System.out.println(s1.name.equals(s2.name));//
//        System.out.println(s1.name==s2.name);   // true due to shallow copying  here modifying one changes another
//
//
//        s1.name="Babes";
//        System.out.println(s2.name);
//        System.out.println(s1.name);


        Address address=new Address("Kathmandu");

        Student s1 = new Student(23,"raju",address);
        Student s2= (Student) s1.clone();

        System.out.println(s1.address.address);
        System.out.println(s1.address.address);

        s1.address.address="pokhara";
        System.out.println(s2.address.address);  // here in deep cloning the reference is not given rather the new cloning is done so here changin one will not affect other

    }
}
