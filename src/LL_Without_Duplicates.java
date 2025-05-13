import java.util.LinkedList;

public class LL_Without_Duplicates {
    public static void main(String[] args) {
        LinkedList<Integer> newLL = new LinkedList<>();
        newLL.add(1);
        newLL.add(2);
        newLL.add(2);
        newLL.add(3);
        newLL.add(4);
        newLL.add(5);
        newLL.add(5);
        newLL.add(6);
        System.out.println(returnLL(newLL));

    }
    public static ListNode deleteDuplicates(ListNode head) {


        ListNode currentNode = head;
        while (currentNode!=null && currentNode.next!=null){
            if (currentNode.val==currentNode.next.val){
                currentNode.next = currentNode.next.next;
            }
            else {
                currentNode = currentNode.next;
            }
        }
        return head;

    }


    public static LinkedList<Integer> returnLL(LinkedList<Integer> newLL){

        LinkedList<Integer> finalList = new LinkedList<>();


        for (int i = 0; i < newLL.size()-1; i++) {
            if (newLL.get(i) != newLL.get(i+1)){
                finalList.add(newLL.get(i));
                
            }
        }
        if (!newLL.isEmpty()) {
            finalList.add(newLL.getLast());
        }


        return finalList;
    }
}
