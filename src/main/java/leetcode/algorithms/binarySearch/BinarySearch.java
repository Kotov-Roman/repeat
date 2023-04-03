package leetcode.algorithms.binarySearch;

public class BinarySearch {

    public int binarySearchForIndexOfNumber(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return -1;
        }
        int middleIndex = (startIndex + endIndex) / 2;
        if (nums[middleIndex] == target) {
            return middleIndex;
        } else if (nums[middleIndex] < target) {
            return binarySearch(nums, target, middleIndex + 1, endIndex);
        } else {
            return binarySearch(nums, target, startIndex, middleIndex - 1);
        }
    }
}
