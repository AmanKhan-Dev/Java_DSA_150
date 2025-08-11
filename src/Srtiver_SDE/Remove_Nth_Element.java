package Srtiver_SDE;

import java.util.LinkedList;
import java.util.List;


public class Remove_Nth_Element {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        while (head != null) {
            removeNthFromEnd(head, 2);
            head = head.next;
        }
    }

    public static ListNode  removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 1; i <=n ; i++) {
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;

        return dummy.next;

    }
}
