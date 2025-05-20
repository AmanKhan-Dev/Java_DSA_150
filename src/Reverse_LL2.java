import java.util.LinkedList;

public class Reverse_LL2 {
    public static void main(String[] args) {




    }
    public ListNode reverseBetween(ListNode head, int left, int right) {

        LinkedList<Integer> newLl = new LinkedList<>();

       while (head!=null && head.next!=null){

           newLl.add(head.val);
           head = head.next;

       }

       newLl.add(left,right);
       newLl.add(right,left);
       

        return head;
    }
}
