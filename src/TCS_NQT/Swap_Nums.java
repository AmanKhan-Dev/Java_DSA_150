package TCS_NQT;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap_Nums {
    public static void main(String[] args) {


        int arr[] = {1,2,3,4,5,6,7,8};
        int n = 3;

       int left = n-1;
       int right =arr.length-n;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        System.out.println(Arrays.toString(arr));


    }
}
