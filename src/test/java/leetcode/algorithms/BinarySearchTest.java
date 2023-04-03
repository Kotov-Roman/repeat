package leetcode.algorithms;

import leetcode.algorithms.binarySearch.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
    private BinarySearch binarySearch;

    @Before
    public void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void binarySearchForIndexOfNumber_WhenElementIsPresent_ThenReturnIndex() {
        int[] nums = {1, 3, 4, 7, 9, 10};
        int target = 4;
        int expectedIndex = 2;
        int actualIndex = binarySearch.binarySearchForIndexOfNumber(nums, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void binarySearchForIndexOfNumber_WhenElementIsNotPresent_ThenReturnNegativeOne() {
        int[] nums = {1, 3, 4, 7, 9, 10};
        int target = 2;
        int expectedIndex = -1;
        int actualIndex = binarySearch.binarySearchForIndexOfNumber(nums, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test(expected=IllegalArgumentException.class)
    public void binarySearchForIndexOfNumber_WhenArrayIsEmpty_ThenThrowIllegalArgumentException() {
        int[] nums = {};
        int target = 2;
        binarySearch.binarySearchForIndexOfNumber(nums, target);
    }

    @Test(expected=IllegalArgumentException.class)
    public void binarySearchForIndexOfNumber_WhenArrayIsNull_ThenThrowIllegalArgumentException() {
        int[] nums = null;
        int target = 2;
        binarySearch.binarySearchForIndexOfNumber(nums, target);
    }
}