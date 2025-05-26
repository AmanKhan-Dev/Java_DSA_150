public class Search_Insert_Position {
    public static void main(String[] args) {
        int nums [] = {1,2,4,5,6};
        int target = 3;
        System.out.println(searchInsert(nums,target));


    }

   public static int searchInsert(int[] nums, int target) {

        int low =0;
        int high = nums.length-1;
        int mid;


        while (low<=high){
            mid = low + (high-low)/2;

            if (nums[mid] == target){
                 return mid;
            } else if (nums[mid]< target) {

                low = mid+1;

            }

            else {
                high = mid-1;
            }

        }

        return low;


    }
}
