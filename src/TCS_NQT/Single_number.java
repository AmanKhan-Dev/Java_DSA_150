package TCS_NQT;

import java.util.ArrayList;
import java.util.Arrays;

public class Single_number {
    public static void main(String[] args) {

        int nums[] = {4,1,2,1,2};
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        System.out.println(result);
    }

}
