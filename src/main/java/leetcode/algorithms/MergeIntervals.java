package leetcode.algorithms;

//https://leetcode.com/problems/merge-intervals/
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//        Output: [[1,6],[8,10],[15,18]]

import java.util.Arrays;
import java.util.stream.Stream;

//Input: intervals = [[1,4],[4,5]]
//        Output: [[1,5]]

//[[1,4],[0,4]]
//[[0,4]]

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] ints = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        merge(ints);
    }

    public static int[][] merge(int[][] intervals) {
        int[] temp = new int[intervals.length * 2];

        temp[0] = intervals[0][0];
        int indexOfTemp = 1;
//        int resultSize = 1;

        int outerPointer = 0;
        int innerPointer = 1;
        while (outerPointer < intervals.length - 1) {
            int lastOfCurrent = intervals[outerPointer][1];
            int firstOfNext = intervals[outerPointer + 1][0];
            if (lastOfCurrent >= firstOfNext) {
            } else {
                temp[indexOfTemp] = lastOfCurrent;
                indexOfTemp++;
                temp[indexOfTemp] = firstOfNext;
                indexOfTemp++;
            }
            outerPointer++;
        }
        //append tail
        temp[indexOfTemp] = intervals[outerPointer][1];
        indexOfTemp++;

//        System.out.println(Arrays.toString(temp));

        // transform to [][]
        int length = indexOfTemp + 1;
        int[][] result = new int[length / 2][2];
        outerPointer = 0;
        indexOfTemp = 0;
        while (outerPointer < length / 2 ) {
            result[outerPointer] = new int[]{temp[indexOfTemp], temp[indexOfTemp + 1]};
            outerPointer++;
            indexOfTemp+=2;
        }

//        System.out.println(Arrays.deepToString(result));
        return result;
    }
}
