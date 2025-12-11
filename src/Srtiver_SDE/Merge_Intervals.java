package Srtiver_SDE;

import java.util.ArrayList;
import java.util.HashSet;

public class Merge_Intervals {
   public static void main(String[] args) {

    int intervals[][] = {

{1,3},
{2,6},
{8,10},
{15,18}


    };
    merge(intervals);




   }
   public static void merge(int[][] intervals) {
     ArrayList <Integer> newArrayList= new ArrayList<>();



     for (int i = 0; i < intervals.length; i++) {
        for (int j = 0; j < intervals[i].length; j++) {

            if (intervals[i][j+1]> intervals[i+1][j]) {

                newArrayList.add(intervals[i][j]);
                newArrayList.add(intervals[i+1][j+1]);

                
            }

            else{
                     newArrayList.add(intervals[i][j]);
                newArrayList.add(intervals[i][j+1]);
            }
            


        }
        
     }
     System.out.println(newArrayList);

   }
}
