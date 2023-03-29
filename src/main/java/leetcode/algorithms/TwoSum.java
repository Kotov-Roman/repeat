package leetcode.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoSum {

    public static void main(String[] args) {
        int [] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {

//        Set<Integer> collected = IntStream.of(nums)
//                .boxed()
//                .collect(Collectors.toSet());
        Map<Integer, Integer> integers = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            integers.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (integers.containsKey(diff) && i!=integers.get(diff)){
                return  new int[]{i, integers.get(diff)};
            }
        }

//        for (int firstIndex = 0; firstIndex < nums.length-1; firstIndex++) {
//
//            for (int secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex++) {
//                if (nums[firstIndex] + nums[secondIndex] == target) {
//                    return new int[]{firstIndex, secondIndex};
//                }
//            }
//        }
        return null;
    }
}
