package Srtiver_SDE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class SortAStACK {

    public static void main(String[] args) {



        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(1);
        st.push(4);
        sortStack(st);
        
    }
     public static void sortStack(Stack<Integer> st) {
        ArrayList <Integer> temp = new ArrayList<>();
        while (st.empty()!=true) {


            temp.add(st.peek());
            st.pop();
        }

        Collections.sort(temp,Collections.reverseOrder());
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i)+ " ");
            
        }
        
    }

  

}