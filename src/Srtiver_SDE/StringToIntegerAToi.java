package Srtiver_SDE;

public class StringToIntegerAToi {
    public static void main(String[] args) {
        String s = "-0040065";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        // 1. Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') i++;

        // 2. Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        long num = 0; // use long to detect overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (num * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int) (num * sign);
    }
}
