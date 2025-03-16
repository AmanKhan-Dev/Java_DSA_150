package TCS_NQT;

import java.util.Arrays;
import java.util.Scanner;

public class MInMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Size : ");
        int size = sc.nextInt();
        int nums [] = new int[size];
        System.out.println("Enter Array Elements : ");
        for (int i =0;i<size ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Min Element : " + minElement(nums));
        System.out.println("Max Element : " + maxElement(nums));


    }




    public static int minElement(int nums[]){

        Arrays.sort(nums);
        return nums[0];

    }

    public static int maxElement(int nums[]){

        int max = nums[0];
        for (int i =0;i<nums.length;i++){
            if (nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}
