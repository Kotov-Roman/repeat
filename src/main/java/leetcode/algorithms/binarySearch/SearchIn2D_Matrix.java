package leetcode.algorithms.binarySearch;

//https://leetcode.com/problems/search-a-2d-matrix
public class SearchIn2D_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        //search row

        int rowIndexToSearch = performSearchForRow(matrix, target, 0, matrix.length - 1);
        if (rowIndexToSearch == -1) {
            return false;
        }
        return isArrayContainsItem(matrix[rowIndexToSearch], target, 0, matrix[rowIndexToSearch].length - 1);
    }

    private boolean isArrayContainsItem(int[] array, int target, int startIndex, int endIndex) {
        //check that target could be in current row
        if (array == null || startIndex > endIndex) {
            return false;
        }

        int middleIndex = (endIndex + startIndex) / 2;
        int current = array[middleIndex];
        if (current == target) {
            return true;
        } else if (current > target) {
            //search in left part
            return isArrayContainsItem(array, target, startIndex, middleIndex - 1);

        } else {
            //search in right part
            return isArrayContainsItem(array, target, middleIndex + 1, endIndex);
        }
    }

    //lets find index
    protected int performSearchForRow(int[][] matrix, int target, int startIndex, int endIndex) {
        //check that target could be in current row
        if (matrix == null || startIndex > endIndex) {
            return -1;
        }

        int middleIndex = (endIndex + startIndex) / 2;
        int[] current = matrix[middleIndex];
        int first = current[0];
        int last = current[current.length - 1];
        if (first <= target && target <= last) {
            return middleIndex;
        } else if (current[0] > target) {
            //search in left part
            return performSearchForRow(matrix, target, startIndex, middleIndex - 1);

        } else {
            //search in right part
            return performSearchForRow(matrix, target, middleIndex + 1, endIndex);
        }
    }
}
