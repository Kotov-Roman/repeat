package leetcode.algorithms.fromIntreview;

import java.util.Arrays;

// [-4, -1, 0, 2, 7] -> [0, 1, 4, 16, 49]
public class PowSortedArray {

    public static void main(String[] args) {
        int[] sorted = {-4, -1, 0, 2, 7};

        int[] ints = powAndSort(sorted);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] powAndSort(int[] arr) {

        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int resultIndex = arr.length - 1;
        int[] result = new int[arr.length];

        int rightVal;
        int leftVal;

        while (resultIndex >= 0) {
            rightVal = arr[rightIndex] * arr[rightIndex];
            leftVal = arr[leftIndex] * arr[leftIndex];

            if (rightVal >= leftVal) {
                result[resultIndex] = rightVal;
                rightIndex--;
            }
            else {
                result[resultIndex] = leftVal;
                leftIndex++;
            }

            resultIndex--;
        }

        return result;
    }
}
