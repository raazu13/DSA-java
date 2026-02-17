public class ReverseAString {
    public static void main(String[] args) {

        System.out.println(reverseString("","dcba"));

        System.out.println(checkPalindrome("abaa"));
    }

    public  static String reverseString(String p, String up){

        if(up.isEmpty()){
            return p;
        }

        char ch = up.charAt(up.length()-1);
        return reverseString(p+ch, up.substring(0,up.length()-1));

    }

    public static boolean checkPalindrome(String s){


         return s.equals(reverseString("",s));

    }
}
