package Srtiver_SDE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Abs_Didd {
    public static void main(String[] args) {

        int nums [] = {4,2,1,3};
        System.out.println(minimumAbsDifference(nums));
        
    }
     public static List<Integer> minimumAbsDifference(int[] arr) {
        List<Integer>reList = new ArrayList<>();
      


     Arrays.sort(arr);

     

     reList.add(arr[0]);
     reList.add(arr[1]);
     int diff = reList.get(1) - reList.get(0);

     if (arr.length>2) {
        
     
        for (int i = 2; i < arr.length-1; i++) {

            if (arr[i+1]-arr[i]==diff) {
                reList.add(arr[i]);
                reList.add(arr[i+1]);
            }
            
        }

       
    }
     return reList;
}
}
