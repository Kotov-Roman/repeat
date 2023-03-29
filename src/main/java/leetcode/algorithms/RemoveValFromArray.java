package leetcode.algorithms;

import java.util.Arrays;

public class RemoveValFromArray {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int i = removeElement(arr, 2);
        System.out.println("removed " + i);

        System.out.println(Arrays.toString(arr));
    }

    public static int removeElement(int[] nums, int val) {

        int removed = 0;
        int lastIndexOfNotVal = -1;
//        {1,3,2,2,3,5,2,4}
        for (int lastIndexOfVal = 0; lastIndexOfVal < nums.length; lastIndexOfVal++) {
            if (val == nums[lastIndexOfVal]) {
                if (lastIndexOfNotVal < 0) {
                    // init and start search after val
                    lastIndexOfNotVal = lastIndexOfVal + 1;
                }

                //find next not val
                while (lastIndexOfNotVal < nums.length && val == nums[lastIndexOfNotVal]) {
                    lastIndexOfNotVal++;
                }
                // rewrite of found
                if (lastIndexOfNotVal < nums.length) {
                    //swap
                    nums[lastIndexOfVal] = nums[lastIndexOfNotVal];
                    nums[lastIndexOfNotVal] = val;

                    lastIndexOfNotVal = lastIndexOfVal + 1;
//                    removed++;
                } else {
                    //means that needed to count all that should be removed from tail
//                    while (lastIndexOfVal< nums.length){
//                        if (val == nums[lastIndexOfVal]){
//                            removed++;
//                        }
//                        lastIndexOfVal++;
//                    }
                    return lastIndexOfVal;
                }
            }
        }

        return nums.length;
    }
}
