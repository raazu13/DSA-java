//• Create a MathOperations class:
//        ○ Overload add() for int, double, 3 parameters.
//	• Create Animal base class → Dog subclass.
//        ○ Override sound().
//        ○ Create Animal a = new Dog(); and call sound().
//        🧠 Concepts: Compile-time & Runtime polymorphism.


package OOP_Bsics.Examples.E4_polymorphism;

public class Main {
    public static void main(String[] args) {
        MathOperations math= new MathOperations();
        System.out.println(math.sum(1,2,3));
        System.out.println(math.sum(2.2,4.5));


        Animal a= new Dog();
        a.sound();   // calls the method of dog overriding runtime polymorphism
    }


}
