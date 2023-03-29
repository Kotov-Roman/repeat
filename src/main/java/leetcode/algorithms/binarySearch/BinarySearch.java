package leetcode.algorithms.binarySearch;

import java.util.Arrays;
import java.util.HashSet;

public class BinarySearch {

    public int binarySearchForIndexOfNumber(int[] nums, int target) {
        int indexOfMiddle;
        int tempIndex = 0;
        while (true) {
            if (nums.length == 1 && nums[0] != target){
                return -1;
            }

            indexOfMiddle = nums.length / 2;

            if (nums[indexOfMiddle] == target) {
                return tempIndex + indexOfMiddle;
            } else if (nums[indexOfMiddle] < target) {
                tempIndex += indexOfMiddle;
                //take right part
                nums = Arrays.copyOfRange(nums, indexOfMiddle, nums.length);
            } else {
                //take left part
                nums = Arrays.copyOf(nums, nums.length / 2);
            }

        }
    }
}
