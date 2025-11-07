

public class S3_This_keyword {
    public static void main(String[] args) {

        This is=new This("raju",24330);
        This i=new This("Tv",233);
        is.display(i);
        is.show();

        i.setId(10).setName("Buriya");
        i.display();

        This raju=new This();
        
        raju.display();

    }
}

class This{

    String name;
    int id;


    //constructor chaining
    This(){
        this("raju",100);
    }
    // distinguishing instance variable and local variable

    This(String name, int id){
        this.id=id;
        this.name=name;


    }


    void display(This i){
        System.out.println("name: "+this.name+" id: "+this.id);
    }
    void display(){
        System.out.println("name: "+name+" id: "+id);
    }

    //passing current object as an argument
    void show(){
        display(this);
    }

    //returning an object using this for method chaining

    This setName(String name){
        this.name=name;
        return this;
    }

    This setId(int id){
        this.id=id;
        return this;

    }





}