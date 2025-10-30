package Srtiver_SDE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class merge_k_sorted {

    public static void main(String[] args) {

        int nums [][] = {

{1,2,3,4},
{2,2,3,4},
{5,5,6,6},
{7,8,9,9}

        };

        System.out.println(mergeKSortedArrays(nums, 4));


        
    }
     public static List<Integer> mergeKSortedArrays(int[][] arr, int k) {


        List <Integer> newIntegers = new ArrayList<>();

        for (int i = 0; i <k; i++) {
            for (int j = 0; j < k; j++) {


                newIntegers.add(arr[i][j]);
                
            }


            

            
        }
        Collections.sort(newIntegers);

        return newIntegers;
        
        
    }
    
}
