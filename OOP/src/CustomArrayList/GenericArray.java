package CustomArrayList;

import java.util.Arrays;

public class GenericArray <T>{

    private  final static int DEFAULT=10;

    private Object[] data;

    private int size=0;

    GenericArray(){
        data= new Object[DEFAULT];
    }

    GenericArray(int size){
        data= new Object[size];
    }

    void add(T value){
        if(isfull()){
            resize();
        }

        data[size++]=value;
    }

    T remove(){
        if(this.isempty()){
            System.out.println("Array is empty!!!");
            return null;
        }
        return (T)(data[--size]);
    }

    T get(int index){
        if(index<0||index>=size){
            System.out.println("Index out of bound");
            return null;
        }
        return (T)(data[index]);
    }

    void set(int index, T value){
        if(index<0||index>=size){
            System.out.println("Index out of bound");
            return;
        }
        data[index]=value;

    }

    int getSize(){
        return size;
    }



    boolean isempty(){
        if(size==0){
            return true;
        }
        return false;
    }



    void display(){
        System.out.print("[");
        for (int i = 0; i <size ; i++) {
            System.out.print(" "+(T)(data[i]));
        }
        System.out.println(" ]");
    }

    boolean isfull(){
        if(data.length==size){
            return true;
        }
        return false;
    }

    void resize(){


        data =  Arrays.copyOf(data,data.length*2);


    }

}
