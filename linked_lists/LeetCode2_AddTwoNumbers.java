package linked_lists;

import linked_lists.models.ListNode;
import linked_lists.utils.ListNodeUtils;

public class LeetCode2_AddTwoNumbers {

    public static void main(String[] args) {
        // This problem was solved directly in LeetCode platform https://leetcode.com/problems/add-two-numbers/
        final var ln1 = ListNodeUtils.createListNode(new int[] { 2, 4, 9 });
        final var ln2 = ListNodeUtils.createListNode(new int[] { 5, 6, 4, 9 });
        ListNodeUtils.printTest(addTwoNumbers(ln1, ln2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumbHead = new ListNode(-1);
        ListNode current = dumbHead;
        int carry = 0;
        while(l1 != null || l2 != null || carry > 0) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            int sum = l1Val + l2Val + carry;

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dumbHead.next;
    }

}
