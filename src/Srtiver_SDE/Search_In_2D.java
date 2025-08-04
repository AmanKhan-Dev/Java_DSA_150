//package Srtiver_SDE;
//
//public class Search_In_2D {
//    public static void main(String[] args) {
//        int matrix[][] = {
//                {1,3,5,7},
//                {10,11,16,20},
//                {23,30,34,60}
//
//        };
//        System.out.println(searchMatrix(matrix,60));
//
//
//    }
//
//
//    public static boolean searchMatrix(int[][] matrix, int target) {
//int rows = matrix.length;
//int cols = matrix[0].length;
//int newArr []= new int[rows*cols];
//int index = 0;
//        for (int i = 0; i <rows ; i++) {
//            for (int j = 0; j <cols ; j++) {
//
//                newArr[index++] = matrix[i][j];
//
//            }
//        }
//
//        for (int i = 0; i < newArr.length; i++) {
//
//            if (newArr[i]==target){
//                return true;
//            }
//
//        }
//        return false;
//
//
//    }
//}
