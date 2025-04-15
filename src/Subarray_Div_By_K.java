public class Subarray_Div_By_K {
    public static void main(String[] args) {

        int nums [] = {4,5,0,-2,-3,1};
        int k =5;
        System.out.println(subarraysDivByK(nums,k));


    }
    public static int subarraysDivByK(int[] nums, int k) {
        int[] modCount = new int[k];
        modCount[0] = 1;
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            int mod = sum % k;


            if (mod < 0) {
                mod += k;
            }


            count += modCount[mod];


            modCount[mod]++;
        }

        return count;
    }
}
