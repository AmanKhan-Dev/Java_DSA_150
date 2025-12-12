package Srtiver_SDE;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Squres_OF_Array {
    public static void main(String[] args) {

      
    }
 
 
 
    public static int[] sortedSquares(int[] nums) {

int result [] = new int[nums.length];
int insert = 0;
        for (int i = 0; i < nums.length; i++) {
            
    insert = nums[i] * nums[i];

   result[i] = insert;

        }

        Arrays.sort(result);
        return result;
    }
}
