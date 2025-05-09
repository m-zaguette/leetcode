package linked_lists;

import java.util.HashMap;
import java.util.Map;

import linked_lists.models.ListNode;

public class LeetCode19_RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        // This problem was solved directly in LeetCode platform https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> nodesMap = new HashMap<>();
        int i = 0;
        while(head != null) {
            nodesMap.put(i++, head);
            head = head.next;
        }

        if (nodesMap.size() == 1) return null;

        int index = nodesMap.size() - n;

        if (index == 0) return nodesMap.get(1);
        nodesMap.get(Math.max(0, index - 1)).next = nodesMap.get(index + 1);

        return nodesMap.get(0);
    }
}
