package Srtiver_SDE;
import java.util.ArrayList;
import java.util.List;


public class NewClass {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        middleNode(head);

    }

    public static ListNode middleNode(ListNode head){

        List<Integer> MyList = new ArrayList<>();
        ListNode temp = head;
        while (temp!=null){

            MyList.add(temp.val);
            temp = temp.next;
        }

        int mid = MyList.size()/2;
        for (int i = mid; i <MyList.size() ; i++) {

            temp = temp.next;

        }

return temp;




    }

}
