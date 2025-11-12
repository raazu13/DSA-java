//• Implement Cloneable in a Student class.
//        • Create shallow and deep copy examples.
//Show difference between == and .equals() on clones.

package OOP_Bsics.Examples.E7_ObjectCloning;

public class Main {                               //must throws this to avoid using try catch
    public static void main(String[] args) throws CloneNotSupportedException {

      Address address=new Address("Kathmandu");

      Student s1= new Student(21,"Raju",address);

      Student s2=(Student) s1.clone();// shallow copy so changing one should change other

        System.out.println(s1.address.address==s2.address.address);
        System.out.println(s1.address.address.equals(s2.address.address));

        s1.address.address="pokhara";

        System.out.println(s2.address.address);/// this should also print the s1 address

        System.out.println(s1.address.address == s2.address.address);
        System.out.println(s1.address.address.equals(s2.address.address));
        s1.age=10;
        System.out.println(s2.age);    // this will not be changed as it is variables ...only objects are changed



        Student s3=(Student) s1.deepClone();    // deepcopy changing one will not affect others at all
        System.out.println(s1.address.address == s3.address.address);
        System.out.println(s1.address.address.equals(s3.address.address));
        s1.address.address="Dehradun";
        System.out.println(s3.address.address);  // this should not print dehradun
        System.out.println(s1.address.address == s3.address.address);
        System.out.println(s1.address.address.equals(s3.address.address));






    }
}
