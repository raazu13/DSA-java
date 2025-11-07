public class methodoverloading {
    public static void main(String[] args) {

        int ans=sum();
        int newans=sum(1,2);
        sum(2);

        System.out.println(ans);
        System.out.println(newans);

    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(){
        return 1+2;
    }

    static void sum(int a){

        System.out.println(a);

    }
}
