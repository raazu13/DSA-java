package generics;

public class GenericArrays<T>{

    private Object[] arr;
     int size=0;

    public GenericArrays() {
        arr=new Object[10];
    }

    public void add(T value){
        arr[size++]=value;
    }

    void remove(int i){
        arr[i]=null;
    }

   public T remove(){
       return (T)(arr[--size]);
    }

    public void set(int index, T value){
        arr[index]=value;
    }
    void display(){
        for(Object a:arr){
            System.out.print(" "+a);
        }
        System.out.println();
    }

    T get(int i){
       return (T)(arr[i]);
    }
}
