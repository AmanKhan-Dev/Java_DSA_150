package Srtiver_SDE;


public class Longest_Increse {
    public static void main(String[] args) {
        int nums [] = {1,1,1,1,1};

        System.out.println(lengthOfLIS(nums));

        
    }

     public static int lengthOfLIS(int[] nums) {


       int count = 0;

        for (int i = 0; i<nums.length-1; i++) {
            int j = i;
            int k = i+1;

            if (nums[k]>nums[j]) {
                count++;
            }

            else if (nums[k]==nums[j]&& count>1) {

                count++;
            }
            
        }

        return count;


        
    }
    
}
