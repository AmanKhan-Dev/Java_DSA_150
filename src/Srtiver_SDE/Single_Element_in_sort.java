package Srtiver_SDE;

public class Single_Element_in_sort {
    public static void main(String[] args) {
        int nums[] = {3,3,7,7,10};
        System.out.println(singleNonDuplicate(nums));
        
    }

    public static int singleNonDuplicate(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            int k = i;
            int j = i+1;

            if (nums[k]==nums[j]) {
                
                i=i+1;
            }

            else if (nums[k]!=nums[j]) {
                return nums[k];
                
            }        
        }
        
        return nums[nums.length - 1];
    }
    
}
