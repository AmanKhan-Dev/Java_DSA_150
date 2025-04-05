package CompetativeCodes;

import java.util.Scanner;

public class Hartals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int days = sc.nextInt();
            int parties = sc.nextInt();
            int[] hartalParams = new int[parties];

            for (int i = 0; i < parties; i++) {
                hartalParams[i] = sc.nextInt();
            }

            boolean[] lostDays = new boolean[days + 1];

            for (int h : hartalParams) {
                for (int day = h; day <= days; day += h) {

                    int weekday = day % 7;
                    if (weekday == 6 || weekday == 0) {
                        continue;
                    }
                    lostDays[day] = true;
                }
            }

            int totalLost = 0;
            for (int i = 1; i <= days; i++) {
                if (lostDays[i]) totalLost++;
            }

            System.out.println(totalLost);
        }

        sc.close();
    }
}

