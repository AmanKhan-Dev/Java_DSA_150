package Srtiver_SDE;

import java.util.*;

public class N_Meetings {
    public static void main(String[] args) {

        int start[] = {1,2};
        int end[] = {100,99};
        System.out.println(maxMeetings(start,end));

    }


    public static int maxMeetings(int start[], int end[]) {
        int n = start.length;
        int[][] meetings = new int[n][2];


        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }


        Arrays.sort(meetings, (a, b) -> a[1] - b[1]);

        Stack<Integer> stack = new Stack<>();
        stack.push(meetings[0][0]); // push start
        stack.push(meetings[0][1]); // push end
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (meetings[i][0] > stack.peek()) {
                stack.push(meetings[i][0]);
                stack.push(meetings[i][1]);
                count++;
            }
        }
        return count;
    }

}
