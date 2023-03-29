package leetcode.algorithms;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] first = {1, 3, 7};
        int[] second = {2, 4, 6, 9};

        int[] merge = merge(first, second);
        System.out.println(Arrays.toString(merge));
    }

    public static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];

        int indexOfFirst = 0;
        int indexOfSecond = 0;
        int indexOfResult = 0;

        while (indexOfFirst < first.length && indexOfSecond < second.length) {
            if (first[indexOfFirst] < second[indexOfSecond]) {
                result[indexOfResult] = first[indexOfFirst];
                indexOfFirst++;
            } else {
                result[indexOfResult] = second[indexOfSecond];
                indexOfSecond++;
            }
            indexOfResult++;
        }

        while (indexOfFirst < first.length) {
            result[indexOfResult] = first[indexOfFirst];
            indexOfResult++;
            indexOfFirst++;
        }
        while (indexOfSecond < second.length) {
            result[indexOfResult] = second[indexOfSecond];
            indexOfResult++;
            indexOfSecond++;
        }
        return result;
    }
}
