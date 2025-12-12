package Srtiver_SDE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diss_In_Array {
    public static void main(String[] args) {
        

        int nums[] = {1,1};
        System.out.println(findDisappearedNumbers(nums));

    }

      public static List<Integer> findDisappearedNumbers(int[] nums) {


        Arrays.sort(nums);
        List <Integer> rIntegers = new ArrayList<>();


        for (int i= 0; i<nums.length-1;i++) {


            
if (nums[i]==nums[i+1]) {
    continue;
    
}


            
            if (nums[i+1]-nums[i]>1) {
            int a = nums[i]+1;
            int b = nums[i+1];

            while (a<b) {

                rIntegers.add(a);
                a= a+1;
                
            }


                
            }


        }

        return rIntegers;
        
    }
    
}
