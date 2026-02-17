package Q10;

public class Main {
    public static void main(String[] args) {

        SchoolOfComputing s= new SchoolOfComputing();
        s.noOfSchools();   // inherited from class  DITuniversity
        s.NoOfSec();

        SecC  c= new SecC();
        c.NoOfSec();     // inherited from SchoolOfComputing
        c.noOfSchools();  // inherited from DITUniversity

    }
}
