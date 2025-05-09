import java.util.Arrays;

public class Maximum_Product {
    public static void main(String[] args) {
        int arr[] = {-100,-98,-1,2,3,4};
        System.out.println(Maximum_Product_Sum(arr));

    }


    public static int Maximum_Product_Sum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;


        int option1 = arr[n - 1] * arr[n - 2] * arr[n - 3];


        int option2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(option1, option2);
    }
}
