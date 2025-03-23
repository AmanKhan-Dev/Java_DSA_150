package CompetativeCodes;


import java.util.HashSet;
import java.util.Scanner;

public class JollyJumpers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int[] sequence = new int[n];
            for (int i = 0; i < n; i++) {
                sequence[i] = sc.nextInt();
            }

            if (isJolly(sequence)) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }

        sc.close();
        System.exit(0);
    }

    public static boolean isJolly(int arr[]) {
        int n = arr.length;


        if (n == 1) {
            return true;
        }

        HashSet<Integer> differences = new HashSet<>();

        for (int i = 1; i < n; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);

            if (diff == 0 || diff >= n) {
                return false;
            }
            differences.add(diff);
        }


        for (int i = 1; i < n; i++) {
            if (!differences.contains(i)) {
                return false;
            }
        }

        return true;
    }
}
