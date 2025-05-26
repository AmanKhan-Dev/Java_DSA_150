public class Max_Points1423 {
    public static void main(String[] args) {

        int nums[] = {2,2,2};
        int k = 2;
        System.out.println(maxScore(nums,k));


    }



    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int max_sum = 0;

        // Special case: if we are picking all cards
        if (n == k) {
            for (int val : cardPoints) {
                max_sum += val;
            }
            return max_sum;
        }

        // Calculate initial sum by picking first k cards from the left
        for (int i = 0; i < k; i++) {
            max_sum += cardPoints[i];
        }

        int curr_sum = max_sum;

        // Try replacing cards from the left with cards from the right
        for (int i = 0; i < k; i++) {
            curr_sum = curr_sum - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            max_sum = Math.max(max_sum, curr_sum);
        }

        return max_sum;
    }

}
