package TCS_NQT;

import java.util.Scanner;

public class Amstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;

        String num1 = Integer.toString(num);

        for (int i =0;i<num1.length();i++){

            int digit = Character.getNumericValue(num1.charAt(i));
            sum += digit*digit*digit;

        }

        if (num==sum){
            System.out.println("Amstrong Number");
        }
        else {
            System.out.println("Not a amstrong number");
        }

    }
}
