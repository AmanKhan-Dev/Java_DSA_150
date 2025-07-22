package TCS_NQT;

import java.util.*;

public class Third_Distinct {
    public static void main(String[] args) {
        Integer arr[] = {2, 2, 3, 1};
        System.out.println(thirdMax(arr));  // Output: 1
    }

    public static Integer thirdMax(Integer[] nums) {
        // Use TreeSet to maintain descending order and uniqueness
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        set.addAll(Arrays.asList(nums));

        if (set.size() < 3) {
            return set.first(); // return the maximum
        } else {
            Iterator<Integer> it = set.iterator();
            it.next(); // 1st max
            it.next(); // 2nd max
            return it.next(); // 3rd max
        }
    }
}
