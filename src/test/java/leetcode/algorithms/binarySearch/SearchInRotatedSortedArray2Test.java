package leetcode.algorithms.binarySearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInRotatedSortedArray2Test extends SearchInRotatedSortedArrayTest {

    @Before
    public void setup() {
        searcher = new SearchInRotatedSortedArray2();
    }

    @Test
    public void testSearchArray() {
        int[] nums = {1, 0, 1, 1, 1};
        int target = 0;
        int expectedIndex = 1;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchArray2() {
        int[] nums = {3, 1, 1};
        int target = 3;
        int expectedIndex = 0;
        int actualIndex = searcher.search(nums, target);
        assertEquals(expectedIndex, actualIndex);
    }
}
