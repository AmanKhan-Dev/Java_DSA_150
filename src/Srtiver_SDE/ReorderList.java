package Srtiver_SDE;

import java.util.ArrayList;

public class ReorderList {
    public static void main(String[] args) {

        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
         ln.next.next = new ListNode(3);
          ln.next.next.next = new ListNode(4);
      ln.next.next.next.next = new ListNode(5);

           reorderList(ln);
        
    }

     public static void reorderList(ListNode head) {

        ArrayList <Integer> aList = new ArrayList<>();
        ArrayList<Integer> finaArrayList = new ArrayList<>();


    while (head!=null) {

        aList.add(head.val);
        head = head.next;
        
    }
    
   int i = aList.get(0);
   int j = aList.get(aList.size()-1);

   while (i<=j) {
    finaArrayList.add(i);
    if (i!=j) {
        finaArrayList.add(j);
    }
 


    i++;
    j--;
    
   }

   
 System.out.println(aList);
   System.out.println(finaArrayList);
        
    }
    
}
