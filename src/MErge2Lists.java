
public class MErge2Lists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        ListNode mergedHead = newMergedList(list1, list2);


        printList(mergedHead);
    }

    public static ListNode newMergedList(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(-1);


        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;

        }


        return current;

    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    class ListNodeN {
        int val;
        ListNodeN next;

        ListNodeN(int val) {
            this.val = val;
            this.next = null;
        }
    }
}