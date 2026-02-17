package R2_TwoBranchRecursion.subsetOrsubsequences.permutation;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {

        permut("","abc");
        System.out.println(permutt("","abc"));
        System.out.println(permutCount("","abcd"));

    }

    static void permut(String p, String up ){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String first= p.substring(0,i);
            String second= p.substring(i);
            permut(first+ch+second,up.substring(1));
        }
    }

    static ArrayList<String> permutt(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String first= p.substring(0,i);
            String second=p.substring(i);
            ArrayList<String> a= permutt(first+ch+second,up.substring(1));
            ans.addAll(a);
        }

        return ans;
    }

    static int permutCount(String p, String up){

        if(up.isEmpty()){

            return 1;
        }

      int  count =0;
        char ch= up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String first= p.substring(0,i);
            String second= p.substring(i);
           count += permutCount(first+ch+second,up.substring(1));
        }

        return count;
    }
}
