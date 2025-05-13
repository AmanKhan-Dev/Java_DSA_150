import java.util.List;

public class Partition_List {
    public static void main(String[] args) {

    }


    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode before = l1;
        ListNode after = l2;

        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.val < x) {
                before.next = currentNode;
                before = before.next;
            } else {
                after.next = currentNode;
                after = after.next;
            }
            currentNode = currentNode.next;
        }

        after.next = null;
        before.next = l2.next;

        return l1.next;
    }

}
