package CompetativeCodes;

import java.util.Scanner;

public class ThreeN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(i + " " + j + " " + solution(i, j));
    }

    public static int solution(int i , int j){
        int maxCycle = 0;


        for (int num = i; num <=j ; num++) {
            int count = 1;
            int current = num;
            while (current!=1){
                if (current%2==0){
                    current= current/2;
                }
                else {
                    current = 3*current+1;
                }
                count++;
            }

            if (count >maxCycle){
                maxCycle = count;
            }



        }
        return maxCycle;

    }
}
