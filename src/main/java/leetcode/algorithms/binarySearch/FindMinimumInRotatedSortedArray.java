package leetcode.algorithms.binarySearch;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//        [9,0,1,2,4,5,6,7,8] might become:
//        [1,2,4,5,6,7,0] might become:
//        [4,5,6,7,0,1,2] if it was rotated 4 times.
//        [0,1,2,4,5,6,7] if it was rotated 7 times.

//0,1,3,4,5
// 4,5,0,1,3
//3,4,5,0,1

//0,1,2,3,4,5   start less, then end ->start is least
//4,5,0,1,2,3  mid<end      40,50,0,10,20,30,35
//1,2,3,4,5,0

//if(nums[start] <= nums[mid] && nums[mid] > nums[end])->right

// 1,0
// 0,1
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        //
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while (start<end){
            mid = (start+end)/2;
            if (mid>0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }

            if (nums[mid]>nums[end]){
                //search in right part
                start = mid+1;
            }else {
                //search in left
                end = mid-1;
            }
        }
        return nums[start];
    }

//OLD SOLUTION
//    public int findMin(int[] nums) {
//
//        //if start < end -> means is sorted - use usual binary search
//        //else if mid < start -> search in left
//        //else search in right
//
//        // is next less ? if true next is minimum
//        int startIndex = 0;
//        int endIndex = nums.length - 1;
//        int currentMidIndex = 0;
//        int startVal;
//        int endVal;
//        int currMidVal;
//
//        while (true) {
//            int currLength = endIndex - startIndex + 1;
//            currentMidIndex = (startIndex + endIndex) / 2;
//            currMidVal = nums[currentMidIndex];
//            startVal = nums[startIndex];
//            endVal = nums[endIndex];
//
////            if (currLength == 1) {
//            if (currentMidIndex + 1 < nums.length) {
//                if (currMidVal > nums[currentMidIndex + 1]) {
//                    return nums[currentMidIndex + 1];
//                }
//            }
//            if (currentMidIndex - 1 >= 0) {
//                if (currMidVal < nums[currentMidIndex - 1]) {
//                    return nums[currentMidIndex];
//                }
//            }
//
//            if (currLength == 1) {
//                return nums[currentMidIndex];
//            }
//
//            if (startVal < endVal) {
////                means is sorted and first is least
//                return startVal;
//
//            } else if (currMidVal > startVal) {
//                //search in right
//                startIndex = currentMidIndex + 1;
//            } else {
//                endIndex = currentMidIndex - 1;
//                //search in left
//            }
//        }
//    }
}
