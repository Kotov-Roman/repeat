package leetcode.algorithms.linkedLists;

import leetcode.helpers.ListNode;

//https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            if (next==head){
                return true;
            }

            current.next = previous;
            previous = current;
            current = next;
        }
        return false;
    }
}
