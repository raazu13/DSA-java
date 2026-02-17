package R2_TwoBranchRecursion.subsetOrsubsequences.permutation;


import java.util.ArrayList;
import java.util.List;

public class letterCobinationOfPhoneNo {
    public static void main(String[] args) {

        pad("","123");
        System.out.println(padList("","1234"));
        System.out.println(padCount("","12"));

    }

    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0)-'0';

        for(int i= (digit-1)*3; i<digit*3; i++){
            char c = (char) ('a'+i);
            pad(p+c,up.substring(1));
        }

    }

    public static List<String> padList(String p, String up){
        if(up.isEmpty()){
            List<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String > list = new ArrayList<>();

        int digits= up.charAt(0)-'0';

        for(int i= (digits-1)*3; i<digits*3; i++){
            char c=(char)('a'+i);
            list.addAll(padList(p+c,up.substring(1)));
        }
        return list;
    }

    public static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit = up.charAt(0)-'0';

        for(int i= (digit-1)*3; i<digit*3; i++){
            char c = (char) ('a'+i);
            count+=padCount(p+c,up.substring(1));
        }
        return count;
    }

}
