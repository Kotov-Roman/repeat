package leetcode.algorithms;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonInArrays {

    public static void main(String[] args) {
        int first[] = {1, 2, 4, 5};
        int[] second = {3, 3, 4};
        int[] third = {2, 3, 4, 5, 6};
        int common = findCommon(first, second, third);
        System.out.println(common);
    }


    // is not good solution cuz uses extra memory
    public static int findCommon(int[] first, int[] second, int[] third) {

        Set<Integer> firstSet = Arrays.stream(first)
                .boxed()
                .collect(Collectors.toSet());

        Set<Integer> secondSet = Arrays.stream(second)
                .boxed()
                .filter(firstSet::contains)
                .collect(Collectors.toSet());
        Set<Integer> thirdSet = Arrays.stream(third)
                .boxed()
                .filter(secondSet::contains)
                .collect(Collectors.toSet());


        Optional<Integer> first1 = thirdSet.stream().findFirst();
        Integer integer = first1.orElse(-1);
        return integer;
    }
}
