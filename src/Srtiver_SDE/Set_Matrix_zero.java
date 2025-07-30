package Srtiver_SDE;

public class Set_Matrix_zero {
    public static void main(String[] args) {

        int[][] array = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);

            }
        }



    }


    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // Mark row
                    for (int k = 0; k < cols; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = -1;
                        }
                    }
                    // Mark column
                    for (int k = 0; k < rows; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = -1;
                        }
                    }
                }
            }
        }

        // Second pass: convert -1 to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}