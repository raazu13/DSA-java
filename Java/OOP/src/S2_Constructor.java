public class S2_Constructor {
    public static void main(String[] args) {

        Default constructor = new Default();
        constructor.name="default";
        System.out.println(constructor.name);

        Students raju=new Students("Raju Kushwha", 1000024330);

        System.out.println(raju.name);
        System.out.println(raju.id);

        Students kushwaha=new Students(raju);

        System.out.println(kushwaha.name);

        Overloading student1=new Overloading();
        Overloading student2=new Overloading("raju");
        Overloading student3=new Overloading("Kushwha",23440);
        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);
    }

}

class Default{
    String name;

//    Default(){   in default constructor we dont need to custome code it is provided by java

//
//    }
}



class Students{
   String name;
   int id;


    //parameterized constructor
   Students(String nam, int ide){
       name=nam;
       id=ide;
   }

   //Copy constructor
   Students(Students s){
       name=s.name;
       id=s.id;
    }
}


class Overloading{
    String name;
    int id;

    Overloading(){
        //default constructor no arguments is passed
    }

    Overloading(String nam){
        name=nam;
    }

    Overloading(String nam, int i){
        name=nam;
        id=i;
    }
}