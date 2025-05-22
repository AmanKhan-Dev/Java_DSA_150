package TCS_NQT;

import java.util.Arrays;
import java.util.Scanner;

public class Airport_Security {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        Solution(arr,size);

    }



    public static void Solution(int arr[],int size){

        Arrays.sort(arr);

        for (int i = 0; i <size ; i++) {


            System.out.print(arr[i] + " ");

        }






    }
}
