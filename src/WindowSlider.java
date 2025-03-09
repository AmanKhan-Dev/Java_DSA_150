public class WindowSlider {
    public static void main(String[] args) {
int nums[] = {2, 1, 5, 1, 3, 2};
int k =3;
        System.out.println(maxSum(nums,k));

    }

    public static int maxSum(int nums[] , int k){

int maxSum = 0;
int windowSum =0;
if (nums.length<k){
    throw  new IllegalArgumentException("Array length must be greater than or equal to k(Window size).");
}
        for (int i = 0; i <k ; i++) {
            windowSum+= nums[i];
        }
        maxSum = windowSum;
        for (int i = k; i <nums.length ; i++) {
            windowSum += nums[i] - nums[i-k];

            if (windowSum>maxSum){
                maxSum = windowSum;
            }

        }
        return maxSum;



    }
}
