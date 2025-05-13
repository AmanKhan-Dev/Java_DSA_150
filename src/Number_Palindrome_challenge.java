public class Number_Palindrome_challenge {
    public static void main(String[] args) {
        System.out.println(Solution(196));
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }


    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }


    public static int Solution(int x) {
        int count = 0;

        while (!isPalindrome(x)) {
            int reversed = reverseNumber(x);
            x = x + reversed;
            count++;
        }

        return count;
    }
}
