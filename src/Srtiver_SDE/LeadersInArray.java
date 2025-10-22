package Srtiver_SDE;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int nums [] = { 1, 2, 5, 3, 1, 2};
        System.out.println(leaders(nums));
    }




     public static List<Integer> leaders(int[] nums) {
        List<Integer> newList = new ArrayList<>();



        for (int i = 0; i < nums.length-1; i++) {
            int a = nums[i];
            int b = nums[i+1];

            while (a>b) {

                b = nums[i++];
                if (a<b) {
                    i = nums[i+1];
                    
                }
                
            }
            newList.add(nums[i]);
            
            
        }
        newList.add(nums[nums.length-1]);
        return newList;

        
    }
    
}
