package Srtiver_SDE;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int nums[] = {5,2};
        System.out.println(rob(nums));

        
    }


    public  static int rob(int[] nums) {
        int total = 0;

        for (int i =0; i<nums.length;i++) {
            if (i%2==0) {
                total+=nums[i];
            }
        


        }

        return total;
        
    }
    
}
