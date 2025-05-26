import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sum_Of_Unique {
    public static void main(String[] args) {


        int nums[] = {1,3,2,3,2,4,4,5,5,5};
        System.out.println(sumOfUniques(nums));

    }

    public static int sumOfUniques(int arr[]){

int sum=0;
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]!=arr[i+1]){
                sum+=arr[i];
            }


        }
       sum+= arr[arr.length-1];
        return sum;

    }


}
