import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Raju";


        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(find(name, 'a'));
        System.out.println(search(name, 'j'));
    }

    static boolean find(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char element : str.toCharArray()) {
            if (element == target) {
                return true;
            }
        }
        return false;

    }

    static int search(String str, char target) {


        if (str.length() == 0) {
            return -1;
        }
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == target) {
                return index;

            }


        }
        return -1;
    }
}
