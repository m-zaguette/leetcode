package linked_lists;

import linked_lists.models.ListNode;

public class LeetCode206_ReverseLinkedList {

    public static void main(String[] args) {
        // This problem was solved directly in LeetCode platform https://leetcode.com/problems/reverse-linked-list/
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode reversedListNode = new ListNode(head.val);
        do {
            head = head.next;
            ListNode tempListNode = new ListNode(head.val);
            tempListNode.next = reversedListNode;
            reversedListNode = tempListNode;
        } while (head.next != null);
        return reversedListNode;
    }
}


