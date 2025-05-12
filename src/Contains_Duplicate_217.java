import java.util.ArrayList;
import java.util.Arrays;

public class Contains_Duplicate_217 {
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;

    }

    //  Optimal Solution
//    public boolean containsDuplicate(int[] nums) {
//
//        Set setNums = new HashSet();
//
//        for(int n: nums){
//            if(!setNums.add(n)){
//                return true;
//            }
//        }
//
//        return false;
//
//    }

}
