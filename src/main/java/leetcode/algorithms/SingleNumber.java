package leetcode.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{-997, -997, -784, -784, -560, -560, -527}));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int current;
        int next;
        for (int i = 0; i < nums.length - 1; i += 2) {
            current = nums[i];
            next = nums[i + 1];
            if (current != next) {
                return current;
            }
        }
        return nums[nums.length - 1];
    }
}
