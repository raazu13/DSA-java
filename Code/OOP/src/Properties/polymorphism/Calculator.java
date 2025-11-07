package Properties.polymorphism;

public class Calculator {
    int a;
    int b;
    int c;
    Calculator (){
        this.a=0;
        this.b=0;
        this.c=0;
    }

    Calculator(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void sum(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("The sum is: "+ (this.a+this.b));
    }

    public void sum(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("The sum is: "+ (this.a+this.b+this.c));
    }

    public void sum(){

        System.out.println("The sum is: "+ (this.a+this.b+this.c));
    }



}
