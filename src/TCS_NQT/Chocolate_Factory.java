package TCS_NQT;

import java.util.Arrays;

public class Chocolate_Factory {
    public static void main(String[] args) {

        int arr[] = {4, 5, 0, 1, 9, 0, 5, 0};
        Solution(arr);

    }


    public static void Solution(int arr[]) {
        int count = 0; // position to place non-zero elements

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill remaining positions with 0
        while (count < arr.length) {
            arr[count++] = 0;
        }

        // Print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
