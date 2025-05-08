package TCS_NQT;

import java.util.Arrays;

public class Finding_Duplicates {
    public static void main(String[] args) {

        int nums[] = {1,3,4,2,2};
        System.out.println(findDuplicates(nums));

    }
    public  static int findDuplicates(int nums[]){

        Arrays.sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==nums[i+1]){
                return nums[i];

            }

        }

        return 0;



    }
}
