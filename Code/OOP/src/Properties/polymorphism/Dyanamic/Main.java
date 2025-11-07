package Properties.polymorphism.Dyanamic;

public class Main {
    public static void main(String[] args) {

        Radius r= new Radius();
        r.area();

        Shape s= new Radius();
        s.area();

        Shape t= new Circle(); // parent reference child the object circle is assigned to Shape
        t.area();

    }
}
