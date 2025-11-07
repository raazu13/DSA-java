public class Q2_SingleNumberInArray {
    public static void main(String[] args) {

        int[] arr={1,1,2,2,3,4,3,5,4};
        System.out.println(single(arr));

    }

    public static int single(int[] arr){

        int single=0;

        for(int num: arr){
            single= single^num;
        }

        return single;
    }
}
