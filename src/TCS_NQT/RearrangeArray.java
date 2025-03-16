package TCS_NQT;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
int arr[] = {8,7,1,6,5,9};
Solution(arr);
    }

    public static void Solution(int arr[]){

        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <arr.length/2 ; i++) {
            System.out.print(arr[i]+ " ");
        }

        for (int i = arr.length-1;i>= arr.length/2; i--) {
            System.out.print(arr[i] + " ");
        }



    }
}
