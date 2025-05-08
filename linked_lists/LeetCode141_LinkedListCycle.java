package linked_lists;

import linked_lists.models.ListNode;

public class LeetCode141_LinkedListCycle {

    public static void main(String[] args) {
        // This problem was resolved directly in LeetCode platform https://leetcode.com/problems/linked-list-cycle/
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

}
