package Srtiver_SDE;

public class CountInversions {
    public static void main(String[] args) {
         int arr [] ={-10, -5, 6, 11, 15, 17};
        System.out.println(Solution(arr));
        
    }
    public static int Solution(int arr[]) {
    int count = 0;
    int n = arr.length;

    
    for (int i = 0; i < n - 1; i++) {
        
        for (int j = i + 1; j < n; j++) {

            if (arr[i] > arr[j]) {
                count++;
            }
        }
    }
    return count;
}

}