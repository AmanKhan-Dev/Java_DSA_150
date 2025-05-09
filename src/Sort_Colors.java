import java.util.ArrayList;

public class Sort_Colors {

    public static void main(String[] args) {

        int nums[] = {2, 0, 2, 1, 1, 0};
        sortingColors(nums);


        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

    public static void sortingColors(int nums[]){
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] == 0){
                count0++;
            } else if (nums[i] == 1) {
                count1++;

            }
            else if (nums[i] == 2) {
                count2++;
            }
        }

        int index = 0;
        for (int i = 0; i <count0 ; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i <count1 ; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i <count2 ; i++) {
            nums[index++] = 2;
        }
    }

}
