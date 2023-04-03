package leetcode.algorithms.binarySearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInRotatedSortedArrayTest {
    protected SearchInRotatedSortedArray searcher;

    @Before
    public void setup() {
        searcher = new SearchInRotatedSortedArray();
    }

    @Test
    public void testSearchFoundAtBeginning() {
        int[] nums = {5, 6, 7, 8, 0, 1, 2, 3, 4};
        int target = 5;
        int expectedIndex = 0;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchFoundAtMiddle() {
        int[] nums = {5, 6, 7, 8, 0, 1, 2, 3, 4};
        int target = 1;
        int expectedIndex = 5;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchFoundAtEnd() {
        int[] nums = {5, 6, 7, 8, 0, 1, 2, 3, 4};
        int target = 4;
        int expectedIndex = nums.length - 1;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchNotFound() {
        int[] nums = {5, 6, 7, 8, 0, 1, 2, 3, 4};
        int target = 9;
        int expectedIndex = -1;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchEmptyArray() {
        int[] nums = {};
        int target = 0;
        int expectedIndex = -1;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchArrayWithOneElementFound() {
        int[] nums = {1};
        int target = 1;
        int expectedIndex = 0;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchArrayWithOneElementNotFound() {
        int[] nums = {1};
        int target = 2;
        int expectedIndex = -1;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchArrayWithTwoElementsFoundAtBeginning() {
        int[] nums = {1, 2};
        int target = 1;
        int expectedIndex = 0;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchArrayWithTwoElementsFoundAtEnd() {
        int[] nums = {1, 2};
        int target = 2;
        int expectedIndex = 1;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchArrayWithTwoElementsNotFound() {
        int[] nums = {1, 2};
        int target = 3;
        int expectedIndex = -1;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }
}
