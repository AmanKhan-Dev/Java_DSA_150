package TCS_NQT;

public class ReverseArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8};

        reverseTheArray(nums);

    }
    public static void reverseTheArray(int nums[]){
        int solution [] = new int[nums.length];
        for (int i = nums.length-1; i >=0; i--) {


            solution[nums.length-i-1] = nums[i];

        }
        for (int i = 0; i <solution.length ; i++) {
            System.out.print(solution[i] + " ");
        }
    }


}
