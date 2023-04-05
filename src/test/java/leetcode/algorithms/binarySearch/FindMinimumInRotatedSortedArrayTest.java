package leetcode.algorithms.binarySearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void testFindMin() {
        FindMinimumInRotatedSortedArray finder = new FindMinimumInRotatedSortedArray();
        int[] nums1 = {1};
        assertEquals(1, finder.findMin(nums1));
    }

    @Test
    public void testFindMin2() {
        FindMinimumInRotatedSortedArray finder = new FindMinimumInRotatedSortedArray();
        int[] nums1 = {1, 0};
        assertEquals(0, finder.findMin(nums1));
    }

    @Test
    public void testFindMin3() {
        FindMinimumInRotatedSortedArray finder = new FindMinimumInRotatedSortedArray();
        int[] nums1 = {3, 4, 5, 1, 2};
        assertEquals(1, finder.findMin(nums1));
    }

    @Test
    public void testFindMin4() {
        FindMinimumInRotatedSortedArray finder = new FindMinimumInRotatedSortedArray();
        int[] nums1 = {40, 50, 0, 10, 20, 30, 35};
        assertEquals(0, finder.findMin(nums1));
    }

    @Test
    public void testFindMin5() {
        FindMinimumInRotatedSortedArray finder = new FindMinimumInRotatedSortedArray();
        int[] nums1 = {4, 5, 0, 1, 2, 3};
        assertEquals(0, finder.findMin(nums1));
    }

    @Test
    public void testFindMin6() {
        FindMinimumInRotatedSortedArray finder = new FindMinimumInRotatedSortedArray();
        int[] nums1 = {0, 1, 2, 3, 4, 5};
        assertEquals(0, finder.findMin(nums1));
    }

    @Test
    public void testFindMin7() {
        FindMinimumInRotatedSortedArray finder = new FindMinimumInRotatedSortedArray();
        int[] nums1 = {1, 2, 3, 4, 5, 0};
        assertEquals(0, finder.findMin(nums1));
    }
}
