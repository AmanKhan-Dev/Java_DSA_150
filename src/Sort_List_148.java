import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_List_148 {
    public static void main(String[] args) {





    }
    public static ListNode sortList(ListNode head) {

        List<Integer> newList = new ArrayList<>();

        if (head==null) return null;


        ListNode current = head;
        while (current!= null){

            newList.add(current.val);
            current = current.next;

        }


        Collections.sort(newList);
        current = head;
        for (int val: newList){
            current.val = val;
            current = current.next;
        }

        return  head;




    }
}
