import java.util.HashSet;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(LongestSubstringWithoutRepetition(s));

    }
    public static int LongestSubstringWithoutRepetition(String s){
        int start =0;
        int end = 0;
        int maxLength =0;
        HashSet<Character> charSet = new HashSet<Character>();
        while (end<s.length()){

            if (!charSet.contains(s.charAt(end))){
                charSet.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, charSet.size());
            }
            else {
                charSet.remove(Character.valueOf(s.charAt(start)));
                    start++;
                }
            }



        return maxLength;

    }
}
