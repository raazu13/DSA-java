package CustomArrayList;

import java.util.Arrays;

public class CustomArray {

   private  final static int DEFAULT=10;

    private int[] data;

    private int size=0;

    CustomArray(){
        data= new int[DEFAULT];
    }

    CustomArray(int size){
        data= new int[size];
    }

    void add(int value){
        if(isfull()){
            resize();
        }

        data[size++]=value;
    }

    int remove(){
        if(this.isempty()){
            System.out.println("Array is empty!!!");
            return -1;
        }
        return data[--size];
    }

    int get(int index){
        if(index<0||index>=size){
            System.out.println("Index out of bound");
            return -1;
        }
        return data[index];
    }

    void set(int index, int value){
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
            System.out.print(" "+data[i]);
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
