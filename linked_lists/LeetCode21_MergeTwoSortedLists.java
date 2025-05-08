package linked_lists;

import linked_lists.models.ListNode;
import linked_lists.utils.ListNodeUtils;

public class LeetCode21_MergeTwoSortedLists {

    public static void main(String[] args) {
        final var ln1 = ListNodeUtils.createListNode(new int[] { 1, 2, 4 });
        final var ln2 = ListNodeUtils.createListNode(new int[] { 1, 3, 4 });
        ListNodeUtils.printTest(mergeTwoLists(ln1, ln2));
    }

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        final ListNode head = new ListNode();
        ListNode current = head;
        do {
            final int head1Val = head1 == null ? Integer.MAX_VALUE : head1.val;
            final int head2Val = head2 == null ? Integer.MAX_VALUE : head2.val;

            if (head1Val < head2Val) {
                current.next = new ListNode(head1Val);
                head1 = head1.next;
            } else {
                current.next = new ListNode(head2Val);
                head2 = head2.next;
            }
            current = current.next;
        } while (head1 != null || head2 != null);

        return head.next;
    }

}
