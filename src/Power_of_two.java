public class Power_of_two {
    public static void main(String[] args) {

        int n = 6;
        System.out.println(isPowerOfTwo(n));


    }
    public static boolean isPowerOfTwo(int n) {

        return n > 0 && (n & (n - 1)) == 0;
    }
}
