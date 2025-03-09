package CompetativeCodes;

import java.util.Random;
import java.util.Scanner;

public class Minesweppar {
    private static final int SIZE = 4;
    private static final char MINE = '*';
    private static final char UNREVEALED = '-';
    private static final char[][] board = new char[SIZE][SIZE];
    private static final boolean[][] mines = new boolean[SIZE][SIZE];

    public static void main(String[] args) {
        initializeBoard();
        placeMines(3); // Placing 3 mines randomly
        displayBoard();
        playGame();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = UNREVEALED;
            }
        }
    }

    private static void placeMines(int mineCount) {
        Random random = new Random();
        int count = 0;
        while (count < mineCount) {
            int x = random.nextInt(SIZE);
            int y = random.nextInt(SIZE);
            if (!mines[x][y]) {
                mines[x][y] = true;
                count++;
            }
        }
    }

    private static void displayBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter row and column (0-3) to reveal: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                System.out.println("Invalid input! Try again.");
                continue;
            }

            if (mines[row][col]) {
                System.out.println("Game Over! You hit a mine.");
                revealMines();
                displayBoard();
                break;
            } else {
                board[row][col] = (char) ('0' + countAdjacentMines(row, col));
                displayBoard();
            }
        }
        scanner.close();
    }

    private static void revealMines() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (mines[i][j]) {
                    board[i][j] = MINE;
                }
            }
        }
    }

    private static int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;
                if (newRow >= 0 && newRow < SIZE && newCol >= 0 && newCol < SIZE && mines[newRow][newCol]) {
                    count++;
                }
            }
        }
        return count;
    }
}
