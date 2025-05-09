package linked_lists;

import java.util.ArrayList;
import java.util.List;

import linked_lists.models.ListNode;

public class LeetCode876_MiddleOfTheLinkedList {

    public static void main(String[] args) {
        // This problem was solved directly in LeetCode platform https://leetcode.com/problems/middle-of-the-linked-list/
    }

    public static ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }

        return nodes.get(nodes.size() / 2);
    }
}
