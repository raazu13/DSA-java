//• Create a Student class:
//        ○ Private fields: name, age, marks
//		  ○ Add getters/setters with validation (age > 0, marks <= 100)
//	• Create a BankAccount class:
//        ○ Private fields: balance
//		  ○ Methods: deposit(), withdraw() with condition checks.
//🧠 Concepts: Access modifiers, data protection, validation.



package OOP_Bsics.Examples.E2_Encapulation;

public class Main {
    public static void main(String[] args) {
        Bank madh=new Bank("Prince",23455,23000);

        System.out.println(madh.toString());
        System.out.println(madh.getAccountHolderName());

        Student st=new Student(45,45,"Trivhuwan");
        System.out.println(st.getAge());
        st.setName("Bhosdiwala");
//        System.out.println(st.name);  private fields cant be called
    }

}
