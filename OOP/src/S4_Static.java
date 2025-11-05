public class S4_Static {
    static int i=9;
    static class inner{

        static void show(){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

         Sstudent raju=new Sstudent ("raju",24330);
         Sstudent tv= new Sstudent("TV",2345);

        System.out.println( Sstudent.college);
        System.out.println(raju.college);

        Sstudent.display();

        inner in = new inner();  // no need to create object for outer class
        inner.show();


    }
}

class  Sstudent{
    int id;
    String name;

    // static variables
    static String college;
    static int noOfStudents;


    //static block
    static {
        System.out.println("Static block initialized");
        college="Dit";
        noOfStudents=0;
    }

   public Sstudent(String name,int id){
        this.id=id;
        this.name=name; Sstudent.noOfStudents+=1;  // static variables shared by all
    }

    static void display(){
        System.out.println("no.of Sstudents in "+college+" is "+noOfStudents);
    }

}
