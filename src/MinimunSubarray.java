public class MinimunSubarray {
    public static void main(String[] args) {

        int nums [] = {2,3,1,2,4,3};
        int target =7;
        System.out.println(minSubArrayLen(target,nums));


    }

    public static int minSubArrayLen(int target, int[] nums) {

     int window =0;
     int left =0;
     int n = nums.length;
     int min = n+1;
        for (int right = 0; right <n ; right++) {
            window+= nums[right];
            while (window>= target){
                min = Math.min(min,right-left+1);
                window -= nums[left++];


            }
        }
return min == n+1? 0: min;




    }
}
