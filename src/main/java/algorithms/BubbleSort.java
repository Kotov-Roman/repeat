package algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {3, 1, 7, 2, 1, 1};
        System.out.println(Arrays.toString(sort(list)));
    }

    public static int[] sort(int[] list) {
        boolean swap;
        int temp;
        for (int i = 0; i < list.length - 1; i++) {
            swap = false;
            for (int j = 0; j < list.length - 1; j++) {
                int current = list[j];
                int next = list[j + 1];

                //swap
                if (current > next) {
                    temp = current;
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

        return list;
    }
}
