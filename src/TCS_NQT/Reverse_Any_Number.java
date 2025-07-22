package TCS_NQT;

import java.util.Scanner;

public class Reverse_Any_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        String ss = Integer.toString(nums);
        String reversedString = "";
        for (int i = ss.length() - 1; i >= 0; i--) {
            if (ss.charAt(i) != '0') {
                reversedString += ss.charAt(i);
            }


            System.out.println(reversedString);

        }
    }
}