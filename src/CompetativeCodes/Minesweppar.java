package CompetativeCodes;


import java.util.Scanner;

public class Minesweppar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldNumber = 1;

        while (true) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            if (rows == 0 && cols == 0) break; // Stop when 0 0 is encountered

            char[][] grid = new char[rows][cols];
            int[][] minesCount = new int[rows][cols];

            // Reading the input grid
            for (int i = 0; i < rows; i++) {
                grid[i] = scanner.next().toCharArray();
            }

            // Directions for 8 neighboring cells
            int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

            // Processing the grid
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == '*') {
                        // Increment surrounding cells' mine count
                        for (int d = 0; d < 8; d++) {
                            int ni = i + dx[d];
                            int nj = j + dy[d];
                            if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && grid[ni][nj] != '*') {
                                minesCount[ni][nj]++;
                            }
                        }
                    }
                }
            }

            // Printing the result
            if (fieldNumber > 1) System.out.println(); // Separate multiple test cases
            System.out.println("Field #" + fieldNumber + ":");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == '*') {
                        System.out.print('*');
                    } else {
                        System.out.print(minesCount[i][j]);
                    }
                }
                System.out.println();
            }

            fieldNumber++;
        }
        scanner.close();
    }
}
