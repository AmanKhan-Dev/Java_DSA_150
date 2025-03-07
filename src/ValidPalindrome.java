import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }

    public  static boolean isPalindrome(String s){
    String result = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int start = 0;
        int end = result.length()-1;

        while (start<=end){
            if (result.charAt(start)!=result.charAt(end)){
                return false;
            }
            start++;
            end--;

        }
        return true;


    }
}
