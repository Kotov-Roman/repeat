package leetcode.helpers;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

    public void printList() {
        StringBuilder s = new StringBuilder();
        ListNode current = this;
        List<String> list = new ArrayList();
        while (current != null) {
            s.append(current.val);
            list.add(String.valueOf(current.val));
            current = current.next;
        }
        String join = String.join(",", list);
        System.out.println(join);
    }

    public static ListNode createLinkedList(List<Integer> list) {
        ListNode head = new ListNode(list.get(0));
        ListNode current = head;

        for (int i = 1; i < list.size(); i++) {
            ListNode node = new ListNode(list.get(i));
            current.next = node;
            current = node;
        }

        return head;
    }
}
