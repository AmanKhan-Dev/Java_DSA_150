package Srtiver_SDE;

import Srtiver_SDE.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Delete_LL_node {
    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);




    }



    public void deleteNode(ListNode node) {
      node.val = node.next.val;
      node.next = node.next.next;
    }


}
