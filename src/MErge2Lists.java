public class MErge2Lists {
    public static void main(String[] args) {
        MErge2Lists merge2Lists = new MErge2Lists();

        // Creating two sorted linked lists
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        // Merging the lists
        ListNode mergedList = merge2Lists.newMergedList(l1, l2);

        merge2Lists.printList(mergedList);
    }


    public ListNode newMergedList(ListNode l1, ListNode l2) {
        ListNode returnNode = new ListNode(-1);
        ListNode headNode = returnNode;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                returnNode.next = l1;
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode = returnNode.next;
        }


        if (l1 != null) {
            returnNode.next = l1;
        } else {
            returnNode.next = l2;
        }

        return headNode.next;
    }


    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
