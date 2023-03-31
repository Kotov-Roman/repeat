package leetcode.algorithms.linkedLists;

import leetcode.helpers.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LinkedListCycleTest {
    private LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void hasCycle_cycleIsPresent_returnsTrue() {
        //given
        ListNode head = ListNode.createLinkedList(List.of(1, 2, 3));
        head.next.next = head.next;
        //when
        boolean hasCycle = linkedListCycle.hasCycle(head);
        //then
        Assert.assertTrue(hasCycle);
    }

    @Test
    public void hasCycle_NoCycle_returnsFalse() {
        //given
        ListNode head = ListNode.createLinkedList(List.of(1, 2, 3));
        //when
        boolean hasCycle = linkedListCycle.hasCycle(head);
        //then
        Assert.assertFalse(hasCycle);
    }
}