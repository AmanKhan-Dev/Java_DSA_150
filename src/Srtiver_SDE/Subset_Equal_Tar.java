package Srtiver_SDE;
public class Subset_Equal_Tar {
    public static void main(String[] args) {
        int arr [] = {1,2,7,3};
        int target = 6;
        boolean result = isSubsetSum(arr.length - 1, arr, target);
        System.out.println(result); // This will correctly print: true
        
    }

     public static boolean isSubsetSum(int index, int[] arr, int target) {
        
        if (target == 0) {
            return true;
        }

       
        if (index < 0) {
            return false;
        }

       
        boolean include = false;
        if (arr[index] <= target) {
           
            include = isSubsetSum(index - 1, arr, target - arr[index]);
        }

       
        boolean exclude = isSubsetSum(index - 1, arr, target);

     
        return include || exclude;
    }
}