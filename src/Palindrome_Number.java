public class Palindrome_Number {
    public static void main(String[] args) {

        int x = 121;
        System.out.println(Valid_Palindrome(x));

    }
    public static boolean Valid_Palindrome(int x ) {
         String ss = Integer.toString(x);
         int left =0;
         int right = ss.length()-1;
        for (int i = 0; i < ss.length()-1; i++) {

            if (ss.charAt(left)==ss.charAt(right)){
                left ++;
                right--;
            }
            else {
                return false;
            }

        }


return true;


    }

}
