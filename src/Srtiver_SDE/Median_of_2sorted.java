package Srtiver_SDE;

import java.util.ArrayList;
import java.util.Collections;

public class Median_of_2sorted {
    public static void main(String[] args) {

        int nums1[] = {1,2};
        int nums2[] = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {



        ArrayList <Integer> finalAL = new ArrayList<>();
        for (int i = 0; i <= nums1.length-1; i++) {

            finalAL.add(nums1[i]);
            
        }
        for (int i = 0; i <=nums2.length-1; i++) {
            finalAL.add(nums2[i]);
            
        }

    
        Collections.sort(finalAL);
        double mid = 0;
        int mid2 = finalAL.size()/2;
        int mid0 = mid2-1;
        double finalans =0;

        if (finalAL.size()%2!=0) {
            mid = finalAL.get(mid2);
            finalans = mid;
            
        }

        else{
            mid =finalAL.get(mid0) + finalAL.get(mid2);
            finalans = mid/2;

            
        }

        return finalans;
        
        
    }
    
}
