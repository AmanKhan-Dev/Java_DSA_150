public class Move_Zero {
    public static void main(String[] args) {

  int nums [] = {1,0,3,9,0,5,9};

                  moveZeros(nums);


    }

    public static void moveZeros(int nums[]){

        int left =0;
        for (int right = 0; right<nums.length;right++){
            if (nums[right] !=  0){
                int temp = nums [left];
                nums[left] = nums[right];
                nums[right] = temp;
                left ++;
            }
        }

        for (int i =0; i< nums.length; i++){
            System.out.print(nums[i] + " ");
        }


    }
}
