package Srtiver_SDE;

import java.util.Arrays;

public class Playground {
    public static void main(String[] args) {

        int nums[] = {4,5,6,7,1,2};

        System.out.println(findMin(nums));
        
    }

     public static int findMin(int[] nums) {

        Arrays.sort(nums);
        return nums[0];
        
    }
    
}
