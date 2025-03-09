package CompetativeCodes;

import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int ar1[] [] = new int[4][4];
        int ar2 [][] = new int[4][4];
        int result [] []= new int[4][4];
        System.out.println("Enter Elements of array 1 (2x2): ");
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j <ar1[i].length ; j++) {
                ar1[i] [j] = ss.nextInt();
            }
        }
        System.out.println("Enter Elements of array 1 (2x2): ");
        for (int i = 0; i <ar2.length ; i++) {
            for (int j = 0; j <ar2[i].length ; j++) {
             ar2[i][j] = ss.nextInt();
            }

        }
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j <ar1[i].length ; j++) {
               result [i] [j] = ar1[i][j] +ar2[i][j];
            }
        }
        System.out.println("Result in (2x2): ");
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j <ar1[i].length ; j++) {
                System.out.print( result [i][j]+ " ");
            }
            System.out.println();
        }
    }



}
