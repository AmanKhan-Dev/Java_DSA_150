package Srtiver_SDE;

import java.util.Arrays;

public class Repaet_And_Missing {
    public static void main(String[] args) {
        int arr[] = {3,1,2,5,3};
        solution(arr);




    }


    public static void solution(int A[]){
        int repeat = 0;
        int missing = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length-1; i++) {

            if (A[i+1]-A[i]==0){
                repeat = A[i];
            }
            else if (A[i+1]-A[i]>1){
                missing = A[i]+1;
            }

        }

        System.out.println("A = "+repeat);
        System.out.println("B = "+missing);







    }
}
