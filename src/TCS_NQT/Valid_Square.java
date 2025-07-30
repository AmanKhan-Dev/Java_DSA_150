package TCS_NQT;

import java.util.Scanner;

public class Valid_Square {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int num = ss.nextInt();
        System.out.println(isPerfectSquare(num));

    }

    public static boolean isPerfectSquare(int num) {

        int i =1;
        while (i<num){

            int sq = i*i;
            if (sq==num){
                return true;
            }

            else if (sq>num) {
                return false;
            } else if (num==2147483647) {
                return false;

            }
            i++;

        }
        return true;


    }


}
