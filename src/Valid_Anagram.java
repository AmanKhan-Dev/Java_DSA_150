import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "margana";
        System.out.println(isAnagram(s, t));


    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

}
