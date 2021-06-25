package leetcode;

public class No141_LinkedListCycle {

    //    Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class HasCycleInLinkedList {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            if (head.next == head) return true;
            {
                ListNode nextNode = head.next;
                head.next = head;
                boolean isCycle = hasCycle(nextNode);
                return isCycle;
            }
        }
    }
}
