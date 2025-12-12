package TCS_NQT;

import java.util.ArrayList;

public class Larger_Than_Current {



    public static void main(String[] args) {

        int nums [] = {8,1,2,2,3};
        smallerNumbersThanCurrent(nums);
    }

     public static void smallerNumbersThanCurrent(int[] nums) {

    ArrayList<Integer> arrayList = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
        int count = 0;   // reset count for every element

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < nums[i]) {
                count++;
            }
        }

        arrayList.add(count);
    }

    System.out.println(arrayList);
}

}
