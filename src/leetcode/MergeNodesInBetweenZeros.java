package leetcode;


import java.util.ArrayList;

public class MergeNodesInBetweenZeros {
    public class ListNode {
        int val;
        leetcode.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, leetcode.ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode mergeNodes(ListNode head) {

            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            head = head.next;
            while (head != null) {
                if(head.val == 0) {
                    list.add(sum);
                    //System.out.println(sum);
                    sum = 0;
                }
                else {
                    sum += head.val;
                }
                head = head.next;
            }

            System.out.println(list.size());
            ListNode result = new ListNode();
            for(int i = 0; i<list.size(); i++) {
                ListNode node = new ListNode(list.get(i));
                result.next = node;
                result = result.next;
            }


            return result;
        }
    }
