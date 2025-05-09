

public class Mid_Of_LL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        Solution sol = new Solution();
        ListNode middle = sol.middleNode(head);



        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] nodes = new ListNode[100];
        int count = 0;

        while (head != null) {
            nodes[count++] = head;
            head = head.next;
        }

        return nodes[count / 2];
    }
}
