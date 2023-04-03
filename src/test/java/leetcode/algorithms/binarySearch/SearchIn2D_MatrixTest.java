package leetcode.algorithms.binarySearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SearchIn2D_MatrixTest {
    private SearchIn2D_Matrix search;

    @Before
    public void setup() {
        search = new SearchIn2D_Matrix();
    }

    @Test
    public void performSearchForRow() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 90;
        int expected = -1;

        int actual = search.performSearchForRow(matrix, target, 0, matrix.length - 1);

        assertEquals(expected, actual);
    }

    @Test
    public void performSearchForRow2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        int expected = 1;

        int actual = search.performSearchForRow(matrix, target, 0, matrix.length - 1);

        assertEquals(expected, actual);
    }

    @Test
    public void performSearchForRow3() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 1;
        int expected = 0;

        int actual = search.performSearchForRow(matrix, target, 0, matrix.length - 1);

        assertEquals(expected, actual);
    }

    @Test
    public void performSearchForRow4() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 60;
        int expected = 2;

        int actual = search.performSearchForRow(matrix, target, 0, matrix.length - 1);

        assertEquals(expected, actual);
    }

    @Test
    public void performSearchForRow5() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = -60;
        int expected = -1;

        int actual = search.performSearchForRow(matrix, target, 0, matrix.length - 1);

        assertEquals(expected, actual);
    }


    @Test
    public void testSearchMatrix() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        boolean actual = search.searchMatrix(matrix, target);

        assertTrue(actual);
    }

    @Test
    public void testSearchMatrixNotFound() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;

        boolean actual = search.searchMatrix(matrix, target);

        assertFalse(actual);
    }

    @Test
    public void testSearchMatrixEmpty() {
        int[][] matrix = {};
        int target = 3;

        boolean actual = search.searchMatrix(matrix, target);

        assertFalse(actual);
    }

    @Test
    public void testSearchMatrixSingleRow() {
        int[][] matrix = {{1, 3, 5, 7}};
        int target = 5;

        boolean actual = search.searchMatrix(matrix, target);

        assertTrue(actual);
    }

    @Test
    public void testSearchMatrixFirstRow() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 1;

        boolean actual = search.searchMatrix(matrix, target);

        assertTrue(actual);
    }

    @Test
    public void testSearchMatrixLastRow() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 60;

        boolean actual = search.searchMatrix(matrix, target);

        assertTrue(actual);
    }
}