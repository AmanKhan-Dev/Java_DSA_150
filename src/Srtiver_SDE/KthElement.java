package Srtiver_SDE;

import java.util.ArrayList;
import java.util.Collections;

public class KthElement {
    public static void main(String[] args) {
        int a[] = { 2, 3, 6, 7, 9};
        int b[] = {1, 4, 8, 10};
        int k = 6;
        System.out.println(kthElement(a, b, k));

        
    }


    public static int kthElement(int[] a, int[] b, int k) {
    int answer=0;


    ArrayList <Integer> newal = new ArrayList<>();

    for (int i = 0; i < a.length; i++) {

        newal.add(a[i]);
        
    }
    for (int i = 0; i < b.length; i++) {
        newal.add(b[i]);
        
    }
    
    Collections.sort(newal);

    answer = newal.get(k-1);
    return answer;
      
    }
}
