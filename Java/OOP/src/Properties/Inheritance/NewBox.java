package Properties.Inheritance;

public class NewBox extends Box{   // the child class can be created by using extend keyword
    int weight;
    NewBox(){
        this.weight=-1;   // here we only need to initialize child class parent class is being initialized by itself
    }

    NewBox(int l, int w, int h,int weight){
        super(l,w,h);   // the  constructor of parent class can be called by using super keyword
        this.weight=weight;
    }

    NewBox( NewBox n){
        super(n);
        this.weight=n.weight;
    }
}
