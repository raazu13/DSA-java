package Properties.Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Box b=new Box();
        Box c= new Box(3,5,7);

        b.display();
        c.display();

        NewBox n=  new NewBox();
        System.out.println(n.h+" "+n.weight);

        NewBox n1= new NewBox(3,4,5,6);
        n1.display();   // method of parent class is being used by sub class or child class


        // using parent reference variable and child object
        // this is allowed to do but we cant acces the variable of child class that is not in parent
        Box box= new NewBox(1,2,3,4);
//        System.out.println(box.weight);   this will give error

        System.out.println(box.l);  // this can be accesed


        // using child reference variable and parent object

//        NewBox box1= new Box(1,2,3);  this will give error bcz using child reference variable means we can acess all the variables of child class but using parent class constructor we cant initialise all the variables of child like weight is not being initialised here


        SmallBox small= new SmallBox();
   small.h=9;
        System.out.println(small.h);


    }

}
