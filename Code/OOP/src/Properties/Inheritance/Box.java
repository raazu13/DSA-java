package Properties.Inheritance;

public class Box {
    int l;
    int w;
    int h;

    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    Box(int l, int w, int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box b){
        this.l=b.l;
        this.w=b.w;
        this.h=b.h;
    }

    public void display(){
        System.out.println(this.h+" "+this.w+" "+this.l);
    }
}
