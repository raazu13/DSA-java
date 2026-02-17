import java.util.Arrays;

public class arrayusingfun {
    public static void main(String[] args) {

        int[] num={2,4,6,8,0};
        System.out.println(Arrays.toString(num));

        modify(num);
        System.out.println(Arrays.toString(num));


        //in calling the function and passing the array means we are passing the refence to the object so here the changes occur
        //unlike passing the integers value or other primitive value as there is the copy of value is passed and doesnt affects the original value
        // to learn more abt the printing the array and taking input check the previous input bala file
    }

    static void modify(int[] arr){
        arr[0]=0;
        arr[arr.length-1]=0;
    }
}
