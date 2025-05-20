import java.util.HashMap;

public class Two_Sum_Prob {
    public static void main(String[] args) {

        int arr [] = { 2,7,11,15};
        int target =9;
        System.out.println(twoSum(arr,target).toString());

    }


    public static int []twoSum(int nums[], int target) {


        HashMap<Integer, Integer> myMap = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            if (myMap.containsKey(complement)) {
                return new int[]{myMap.get(complement), i};


            }
            myMap.put(nums[i], i);


        }
        return new int[] {};

    }
}
