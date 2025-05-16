import java.util.HashSet;
import java.util.Set;

public class Happy_Number {
    public static void main(String[] args) {
        int num =19;
        System.out.println(isHappy(num));

    }


    public static boolean isHappy(int n) {

        Set<Integer> newSet = new HashSet<>();


        while (n!=1 && !newSet.contains(n)){
            newSet.add(n);

            n = getDigitSquareSum(n);



        }

return n==1;
    }

    public static int getDigitSquareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
