package R2_TwoBranchRecursion.subsetOrsubsequences.permutation;


import java.util.ArrayList;
import java.util.List;

public class numberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {

        dice("",4);
        System.out.println(diceArrayList("",5));
    }

    public static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
        }

        for(int i=1; i<=6 && i<=target; i++){
            dice(p+i,target-i);
        }
    }

    public static List<String> diceArrayList(String p, int target){
        if(target==0){
            List<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list= new ArrayList<>();


        for(int i=1; i<=6 && i<=target; i++){
            list.addAll(diceArrayList(p+i,target-i));
        }

        return list;
    }
}
