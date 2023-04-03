package leetcode.algorithms.binarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
//        [4,5,6,_7_,8,1,2,3]  8
//        [5,_1_,3]            5
//        [4,5,6,_7_,0,1,2]    4
//        [5,1,_2_,3,4]        1
//        [7,1,2,_3_,4,5,6]    7
    public int search(int[] nums, int target) {
        return performSearch(nums, target, 0, nums.length - 1);
    }

    public int performSearch(int[] nums, int target, int startIndex, int endIndex) {
        if (nums == null || startIndex > endIndex) {
            return -1;
        }
        int startVal = nums[startIndex];
        int endVal = nums[endIndex];

        int middleIndex = (endIndex + startIndex) / 2;
        int midVal = nums[middleIndex];

        if (midVal == target) {
            return middleIndex;
        }

        if (midVal < endVal) {
            if (midVal < target && target <= endVal) {
                //search in right
                return performSearch(nums, target, middleIndex + 1, endIndex);
            } else {
                //search in left
                return performSearch(nums, target, startIndex, middleIndex - 1);
            }
        } else {
            if (startVal <= target && target < midVal) {
                //search in left
                return performSearch(nums, target, startIndex, middleIndex - 1);
            } else {
                //search in right
                return performSearch(nums, target, middleIndex + 1, endIndex);
            }
        }

    }
}
