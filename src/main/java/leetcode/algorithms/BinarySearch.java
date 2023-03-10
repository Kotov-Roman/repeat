package leetcode.algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {3, 1, 7, 2, 10, 3, 9, 15};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(binarySearchForIndexOfNumber(list, 1));

    }

    public static int binarySearchForIndexOfNumber(int[] list, int target) {
        int indexOfMiddle;
        int tempIndex = 0;
        while (true) {
            indexOfMiddle = list.length / 2;
            if (list[indexOfMiddle] == target) {
                return tempIndex + indexOfMiddle;
            } else if (list[indexOfMiddle] < target) {
                tempIndex += indexOfMiddle;
                //take right part
                list = Arrays.copyOfRange(list, indexOfMiddle, list.length);
            } else {
                //take left part
                list = Arrays.copyOf(list, list.length / 2);
            }
        }
    }
}
