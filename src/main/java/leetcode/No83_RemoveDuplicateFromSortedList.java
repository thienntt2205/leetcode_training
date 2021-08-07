//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package leetcode;

public class No83_RemoveDuplicateFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode p = head.next;

        while (p != null) {
            if (p.val == prev.val) {
                prev.next = p.next;
                p = p.next;
            } else {
                prev = p;
                p = p.next;
            }
        }

        return head;
    }
}
