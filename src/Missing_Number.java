import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int nums[] = {0,1};
        System.out.println(missingNumber(nums));


    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length ;
        for (int i = 0; i < n; i++) {

            if (nums[i] != i) {
                return i;


            }


        }
        return n;
    }
}