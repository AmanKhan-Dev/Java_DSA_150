package Srtiver_SDE;

public class MAximum_product_subarray {
    public static void main(String[] args) {
        int nums[] = {2, 3, -2, 4};
        System.out.println(maxProduct(nums)); 
    }

   public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int n1 = i;
            int n2 = i;
            int product = 1;

            while (n2 < nums.length) {
                product *= nums[n2];

                if (product > maxProduct) {
                    maxProduct = product;
                }

                n2++;
            }
        }

        return maxProduct;
    }
}
