package Q14;

public class Sec extends Student{

    int sec;
    Sec(){
        this("Raju",23440,'c');
    }

    Sec(String name, int roll, char sec){

        super(name,roll);
        this.sec=sec;
        System.out.println("and sec is: "+this.sec);
    }

}
