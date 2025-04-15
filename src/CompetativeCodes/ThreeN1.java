package CompetativeCodes;

import java.util.Scanner;

public class ThreeN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(i + " " + j + " " + solution(i, j));
        }
        sc.close();

    }

    public static int solution(int i, int j) {
        int maxCycle = 0;
        int start = Math.min(i, j);
        int end = Math.max(i, j);

        for (int num = start; num <= end; num++) {
            int count = 1;
            int current = num;
            while (current != 1) {
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = 3 * current + 1;
                }
                count++;
            }
            maxCycle = Math.max(maxCycle, count);
        }
        return maxCycle;
    }
}
