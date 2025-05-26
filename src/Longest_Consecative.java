import java.util.Arrays;

public class Longest_Consecative {
    public static void main(String[] args) {
        int nums[] = {};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int sequenceCount = 1;
        int maxSequence = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // Skip duplicates
                continue;
            } else if (nums[i] - nums[i - 1] == 1) {
                // Consecutive
                sequenceCount++;
            } else {
                // Reset count
                sequenceCount = 1;
            }

            // Update max sequence
            maxSequence = Math.max(maxSequence, sequenceCount);
        }

        return maxSequence;
    }

}
