interface Animal {
    void eat();
}
interface Pet {
    void play();
}
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats bones and meat.");
    }
    public void play() {
        System.out.println("Dog loves to play fetch.");
    }
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
        d.bark();
    }
}
