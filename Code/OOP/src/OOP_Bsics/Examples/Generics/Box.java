package OOP_Bsics.Examples.Generics;

public class Box <T>{

    private  T value;

   void  add(T value){
        this.value=value;
    }


    T get(){
       return this.value;
    }
    }

