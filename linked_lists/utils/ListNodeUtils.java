package linked_lists.utils;

import linked_lists.models.ListNode;

public class ListNodeUtils {

    public static ListNode createListNode(int[] array) {
        ListNode head = new ListNode(-1);
        ListNode current = head;
        final var length = array.length;
        for (int i = 0; i < length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        return head.next;
    }

    public static void printTest(ListNode ln) {
        int index = 0;
        do {
            System.out.println(String.format("List Node %d: %d", index++, ln.val));
            ln = ln.next;
        } while (ln != null);
    }
}
