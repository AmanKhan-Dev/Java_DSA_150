import java.util.Arrays;
import java.util.Locale;

public class TwoSum2Sorted {

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

        String s = "This";

        String result = s.replaceAll("\\s", "");
        System.out.println(result.toLowerCase());
        System.out.println(s.length());


    }

    public static int[] twoSum(int nums[], int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[]{-1, -1};
    }
}
