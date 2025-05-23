package TCS_NQT;

public class LCM_Finder {
    public static void main(String[] args) {
        System.out.println(lcm(4,8));

    }


    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

}
