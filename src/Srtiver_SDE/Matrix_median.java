package Srtiver_SDE;

import java.util.ArrayList;

public class Matrix_median {
    public static void main(String[] args) {
        int matrix [][] = {
            {1,3,8},
            {2,3,4},
            {1,2,5}
        };
        System.out.println(findMedian(matrix));
        
    }


     public  static int findMedian(int[][] matrix) {
        ArrayList <Integer> al = new ArrayList<>();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {


                al.add(matrix[i][j]);

                
            }
            
        }
        
        int mid = al.size() /2;
        return al.get(mid);
    }
    
}
