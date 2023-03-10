package leetcode.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public static void main(String[] args) {

        String s = "LVIII";
        String d = "D";
        romanToInt(d);
    }

    public int romanToIntBestSolution(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    public static int romanToInt(String roman) {
        String i = roman.replaceAll("I", "1-");
        String v = i.replaceAll("V", "5-");
        String x = v.replaceAll("X", "10-");
        String l = x.replaceAll("L", "50-");
        String c = l.replaceAll("C", "100-");
        String d = c.replaceAll("D", "500-");
        String m = d.replaceAll("M", "1000-");

        List<Integer> splitted = Arrays.stream(m.split("-"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        int total = 0;
        int next = 0;
        if (splitted.size() > 1) {
            for (int j = 0; j < splitted.size() - 1; j++) {
                int current = splitted.get(j);
                next = splitted.get(j + 1);
                if (current >= next) {
                    total += current;
                } else {
                    total -= current;
                }
            }
            total += next;

        } else {
            total = splitted.get(0);
        }

        return total;
    }
}
