package leetcode;
import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
}
public class LinkedListCycle_141 {
        public boolean hasCycle(ListNode head) {
            List<ListNode> list = new LinkedList<>();
            if(head == null)
                return false;
            while(head.next != null) {
                if (list.contains(head))
                    return true;
                else
                    list.add(head);
                head = head.next;
            }
            return false;
        }
    }
}
