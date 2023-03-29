package leetcode.algorithms;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,2,3,4,4,5};
        int[] arr = {1,2,2};

        int removed = removeDuplicates(arr);
        System.out.println(removed);
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length<=1){
            return nums.length;
        }

        int pointerOfUnique = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[pointerOfUnique]<nums[i]){
                pointerOfUnique++;
                nums[pointerOfUnique] = nums[i];
            }else {
                nums[i] = -999;
            }
        }

        return pointerOfUnique+1;
    }
}
