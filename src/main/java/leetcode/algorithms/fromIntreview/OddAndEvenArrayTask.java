package leetcode.algorithms.fromIntreview;

import java.util.Arrays;

//[1, 3, 7, 2, 0, 1, 2 ] before
//[3, 3, 3, 2, 2, 1, 1] after
// когда меняется четность, нужно записать в массив сколько раз была четность эта во все элементы до смены четности
// не выделять новый массив
public class OddAndEvenArrayTask {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 0, 1, 2};

        int[] process = process(arr);
        System.out.println(Arrays.toString(process));
    }

    public static int[] process(int[] arr) {

        int startToFillIndex = 0;

        int nextIndex;

        boolean isCurrentEven = false;
        boolean isNextEven = false;
        int counter = 1;
        for (int currentIndex = 0; currentIndex < arr.length - 1; currentIndex++) {
            nextIndex = currentIndex + 1;
            isCurrentEven = arr[currentIndex] % 2 == 0;
            isNextEven = arr[nextIndex] % 2 == 0;

            if (isCurrentEven == isNextEven) {
                counter++;
                continue;

            }

            //fill in array
            for (; startToFillIndex <= currentIndex; startToFillIndex++) {
                arr[startToFillIndex] = counter;
            }

            counter = 1;
        }
        //append tail
        for (; startToFillIndex < arr.length; startToFillIndex++) {
            arr[startToFillIndex] = counter;
        }

        return arr;
    }
}
