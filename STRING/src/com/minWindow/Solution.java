package com.minWindow;

import java.util.HashMap;

public class Solution {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Frequency map for characters in t
        HashMap<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        // Sliding window variables
        int left = 0, right = 0;
        int required = tFreq.size();  // Unique characters in t
        int formed = 0;  // To track how many characters have the required frequency
        HashMap<Character, Integer> windowFreq = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        int start = 0;  // To store the starting index of the minimum window

        while (right < s.length()) {
            // Add character at right pointer to the window
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

            // If the frequency of the current character in window matches the frequency in t
            if (tFreq.containsKey(c) && windowFreq.get(c).intValue() == tFreq.get(c).intValue()) {
                formed++;
            }

            // Shrink the window from the left if it's a valid window
            while (left <= right && formed == required) {
                c = s.charAt(left);
                int windowLen = right - left + 1;

                // Update the result if the current window is smaller
                if (windowLen < minLen) {
                    minLen = windowLen;
                    start = left;
                }

                // Remove character at left pointer from the window
                windowFreq.put(c, windowFreq.get(c) - 1);
                if (tFreq.containsKey(c) && windowFreq.get(c).intValue() < tFreq.get(c).intValue()) {
                    formed--;
                }

                // Move left pointer to shrink the window
                left++;
            }

            // Move the right pointer to expand the window
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s  =  "ADOBECODEBANC" ;
        String  t = "ABC " ;
        String ans  = minWindow(s , t ) ;
        System.out.println(ans );
    }
}