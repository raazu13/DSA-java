package R2_TwoBranchRecursion.subsetOrsubsequences;

import java.util.ArrayList;
import java.util.List;

public class subsetOfArray {
    public static void main(String[] args) {
        int[] arr ={1,2,2};

        System.out.println(subset(arr));

    }

   public static List<List<Integer>> subset(int[] nums){

        List<List<Integer>> outer = new ArrayList<>();

        help(nums,0,new ArrayList<>(),outer);

        return outer;

    }

    public static void help(int[] nums, int index,List<Integer> current, List<List<Integer>> outer){

        if(index==nums.length){

            outer.add(new ArrayList<>(current));
            return;
        }

        help(nums,index+1,current,outer);

        current.add(nums[index]);

        help(nums,index+1,current,outer);

        current.remove(current.size()-1);
    }

}
