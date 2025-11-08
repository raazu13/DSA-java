//• Abstract class: Shape
//		○ Abstract method: area()
//		○ Subclasses: Circle, Rectangle
//	    • Interface: Playable → implemented by Guitar, Piano.
//🧠 Concepts: Abstract methods, interface implementation, dynamic behavior.


package OOP_Bsics.Examples.E5_abstarctionAndInterface;

public class Main {
    public static void main(String[] args) {

        Circle c= new Circle(2);
        c.area();

        Rectangle r= new Rectangle(2,3);
        System.out.println(r.l);
        r.area();

        Guitar g=new Guitar();

        g.play();
        g.stop();
    }
}
