//• Create 3 classes: Book, Car, Person
//	• Each should have:
//      ○ 3–4 fields
//		○ Parameterized constructor
//		○ Display method
//	• Create objects in Main and print their data.
//        🧠 Concepts: Object creation, reference, method calls.



package OOP_Bsics.Examples.E1_ObjectAndClasses;


public class MAin {
    public static void main(String[] args) {

        Book book1=new Book("Physics",10,200);

        System.out.println(book1.toString());

        Student st=new Student();
        System.out.println(st.toString());
    }
}
