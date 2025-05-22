package TCS_NQT;

import java.util.ArrayList;
import java.util.Arrays;

public class Finding_Duplicates {
    public static void main(String[] args) {

        int nums[] = {1,1,2,3,4,5,2};
        findDuplicates(nums);
    }
    public  static void findDuplicates(int[] nums){
        Arrays.sort(nums);

        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] == nums[i+1]){
                myArray.add(nums[i]);
            }


        }

        System.out.println(myArray);







    }
}
