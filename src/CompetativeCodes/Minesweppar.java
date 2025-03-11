package CompetativeCodes;


import java.util.Scanner;

public class Minesweppar {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int columns = sc.nextInt();
        sc.nextLine();
        char Board[][] = new char[rows][columns];
        System.out.println("Enter the board row by row (use * for the mine and '.' for the safe step):");
        for (int i = 0; i < rows; i++) {
            String line = sc.nextLine();
            Board[i] = line.toCharArray();
        }
        System.out.println("The Generated Result is : ");
       char finalResult[][] = Solution(Board);
       printBoard(finalResult);

    }
    public static char[][] Solution(char[][] Board){

        int rows = Board.length;
        int colums = Board[0].length;

        char resultBoard [][] = new char[rows][colums];

        int directRows[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int directCols[] = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <colums ; j++) {

                if (Board[i][j]=='*'){
                 resultBoard[i][j] = '*';
                }

                else {
                    int mine =0;
                    for (int k = 0; k <8 ; k++) {

                        int moveI = i + directRows[k];
                        int moveJ =  j + directCols[k];

                        if (moveI>=0 && moveI<rows && moveJ>=0&& moveJ<colums){
                            if (Board[moveI][moveJ]=='*'){
                                mine++;
                            }
                        }

                    }
                    resultBoard[i][j] = (char) (mine + '0');


                }
            }

        }
        return resultBoard;
    }
    public static void printBoard(char[][] Board) {
        for (char[] row : Board) {
            System.out.println(new String(row));
        }
    }

}

