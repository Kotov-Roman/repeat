package algorithms;

import java.util.Arrays;

public class LongestCommonPrefix {

    // I've taken this solution from solution here https://leetcode.com/problems/longest-common-prefix/description/
    public static void main(String[] args) {
        String[] str = new String[] {"flower", "flow", "flight", "fl"};

//        String[] str ={}
        Arrays.sort(str);
        String s = longestCommonPrefix(str);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}

