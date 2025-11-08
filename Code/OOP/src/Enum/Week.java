package Enum;

public class Week {

    enum Days {
        monday,tuesday,wednsday,thursday,friday,saturday,sunday;

        Days(){
            System.out.println("Constructor called for"+this);
        }
    }

    public static void main(String[] args) {
        Days day;
        day=Days.monday;

        for(Days d:Days.values()){
            System.out.println(d);
        }
    }


}
