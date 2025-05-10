package CompetativeCodes;

import java.util.*;

public class WhereIS_the_waldorf {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    static boolean match(char[][] grid, int x, int y, String word) {
        int rows = grid.length;
        int cols = grid[0].length;
        word = word.toLowerCase();

        for (int dir = 0; dir < 8; dir++) {
            int nx = x;
            int ny = y;
            int k;

            for (k = 0; k < word.length(); k++) {
                if (nx < 0 || nx >= rows || ny < 0 || ny >= cols ||
                        Character.toLowerCase(grid[nx][ny]) != word.charAt(k)) {
                    break;
                }
                nx += dx[dir];
                ny += dy[dir];
            }

            if (k == word.length()) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            if (sc.hasNextLine()) sc.nextLine(); // blank line

            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();

            char[][] grid = new char[m][n];

            for (int i = 0; i < m; i++) {
                grid[i] = sc.nextLine().toLowerCase().toCharArray();
            }

            int k = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < k; i++) {
                String word = sc.nextLine().toLowerCase();
                boolean found = false;

                for (int x = 0; x < m && !found; x++) {
                    for (int y = 0; y < n && !found; y++) {
                        if (match(grid, x, y, word)) {
                            System.out.println((x + 1) + " " + (y + 1));
                            found = true;
                        }
                    }
                }
            }

            if (T > 0) System.out.println();
        }

        sc.close();
    }
}
