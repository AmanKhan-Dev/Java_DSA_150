package TCS_NQT;

public class Prior_Element {
    public static void main(String[] args) {

        int arr[] = {7,4,8,2,9};
        System.out.println(Solution(arr));

    }


    public static int Solution(int arr[]) {
        int count = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                count++;
                max = arr[i];
            }
        }

        return count;
    }
}



