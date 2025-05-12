import java.lang.reflect.Array;
import java.util.Arrays;

public class Longest_Common_Prefix {
    public static void main(String[] args) {


        String ss [] = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(ss));

    }
    public static String longestCommonPrefix(String[] strs) {


        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
       StringBuilder finalString = new StringBuilder();

        for (int i = 0; i <s1.length() ; i++) {

            if (s1.charAt(i) == s2.charAt(i)){
             finalString.append(s1.charAt(i));



            }
            else {
                break;
            }


        }

        return finalString.toString();





    }
}
