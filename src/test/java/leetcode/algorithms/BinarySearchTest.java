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
    public void binarySearchForIndexOfNumber_NumberIsNotPresent_IndexIsMinus1() {
        //given
        int[] list = {1, 2, 3, 4, 7, 9, 10, 15};
        //when
        int index = binarySearch.binarySearchForIndexOfNumber(list, -2);
        //then
        Assert.assertEquals(-1, index );
    }

    @Test
    public void binarySearchForIndexOfNumber_NumberIsPresent_IndexIsCorrect() {
        //given
        int[] list = {1, 2, 3, 4, 7, 9, 10, 15};
        //when
        int index = binarySearch.binarySearchForIndexOfNumber(list, 1);
        int index2 = binarySearch.binarySearchForIndexOfNumber(list, 3);
        int index3 = binarySearch.binarySearchForIndexOfNumber(list, 15);
        //then
        Assert.assertEquals(0, index);
        Assert.assertEquals(2, index2);
        Assert.assertEquals(7, index3);
    }
}