package Properties.Inheritance;

public class SmallBox  extends NewBox{

    int corner;

    SmallBox(){
        super();
        this.corner=0;
    }
     SmallBox(int l, int w, int h, int weight, int corner){
        super(l,w,h,weight);
        this.corner=corner;
     }

  SmallBox(SmallBox b){
        super(b);   // super is used to acces parent variables
                    //whatever we r passing in the super there should be constructor which takes arguments that we are giving to thr super
        this.corner= b.corner;
  }
}

