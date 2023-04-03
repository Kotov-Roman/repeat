package leetcode.algorithms.binarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class SearchInRotatedSortedArray2 extends SearchInRotatedSortedArray{

//    public boolean search(int[] nums, int target) {
//        return -1 == performSearch(nums, target, 0, nums.length - 1);
//    }

    @Override
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
            if (midVal <= endVal) {
                //it's impossible to choose right or left part
                //so let's use linear search
                int index = -1;
                while (startIndex <= endIndex) {
                    if (nums[startIndex] == target) {
                        index = startIndex;
                        break;
                    }
                    startIndex++;
                }
                return index;
            } else if (startVal <= target && target < midVal) {
                //search in left
                return performSearch(nums, target, startIndex, middleIndex - 1);
            } else {
                //search in right
                return performSearch(nums, target, middleIndex + 1, endIndex);
            }
        }

    }

}
