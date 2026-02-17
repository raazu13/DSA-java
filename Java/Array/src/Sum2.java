import java.util.Arrays;

public class Sum2 {
    public static void main(String[] args){
        int [] num={2,7,11,15};
        int target = 9;

        int [] arr = twoSum(num,target);
        System.out.println(Arrays.toString(arr));




    }

    static int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            if(nums[i]+nums[i+1]==target){
                return new int[]  {i,i+1};
            }
        }

        return new int[]{-1,-1};

    }

}
