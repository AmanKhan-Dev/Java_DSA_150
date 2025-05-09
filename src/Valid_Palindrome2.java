//public class Valid_Palindrome2 {
//    public static void main(String[] args) {
//
//        String s = "abc";
//        System.out.println(validPalindrome(s));
//
//
//    }
//    public static boolean validPalindrome(String s){
//        int i = 0;
//        int j = s.length()-1;
//
//        for (int k =0; k<s.length();k++){
//            if (s.charAt(i)!=s.charAt(j)){
//                return isPalindrome(s,i+1,j);
//            }
//
//
//
//        }
//        return true;
//
//
//    }
//
//    public static boolean isPalindrome(String s,int i,int j){
//        for (int k = 0; k <s.length() ; k++) {
//         if (s.charAt(i)!= s.charAt(j)){
//             return false;
//         }
//        }
//        return true;
//    }
//
//
//}

// ABOVE IS MY SOLUTION WHICH IS ALSO CORRECT
public class Valid_Palindrome2 {
    public static void main(String[] args) {
        String s = "eccer";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        for (; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {

                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }

        return true;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        for (; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
