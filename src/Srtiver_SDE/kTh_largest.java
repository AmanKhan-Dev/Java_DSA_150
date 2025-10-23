package Srtiver_SDE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class kTh_largest {
    public static void main(String[] args) {

        int nums [] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));

        
    }
     public  static int findKthLargest(int[] nums, int k) {

        ArrayList <Integer> newal = new ArrayList<>();
        for (int i = 0; i <= nums.length-1; i++) {
            newal.add(nums[i]);
        }

        Collections.sort(newal, Collections.reverseOrder());

        int kthElement = newal.get(k-1);

        return kthElement;


        
    }
    
}
