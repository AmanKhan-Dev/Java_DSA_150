import java.util.Arrays;
import java.util.Collections;

public class Ransom_Note {
    public static void main(String[] args) {


        String ransomNote = "aaca";
        String magazine = "aaba";
        System.out.println(canConstruct(ransomNote,magazine));


    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        char[] s1 = ransomNote.toCharArray();
        char[] s2 = magazine.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        int i = 0;
        int j = 0;

        while (i < s1.length && j < s2.length) {
            if (s1[i] == s2[j]) {
                i++;
                j++;
            } else if (s1[i] > s2[j]) {
                j++;
            } else {

                return false;
            }
        }

        return i == s1.length;
    }
}
