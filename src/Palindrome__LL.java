import java.util.LinkedList;

public class Palindrome__LL {
    public static void main(String[] args) {





    }


    class Solution {
        public boolean isPalindrome(ListNode head) {
            LinkedList<Integer> list = new LinkedList<>();


            while (head != null) {
                list.add(head.val);
                head = head.next;
            }


            while (list.size() > 1) {
                if (!list.pollFirst().equals(list.pollLast())) {
                    return false;
                }
            }

            return true;
        }
    }

}
