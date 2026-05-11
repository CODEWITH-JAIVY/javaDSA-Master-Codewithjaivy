package com.PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class palindrom {

    // ✅ Checks if the substring s[start...end] is a palindrome
    public static boolean isPalindrom(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // ✅ Backtracking to find all palindromic partitions
    public static void backtracking(String s, int start, List<String> com, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(com));  // Found a valid partition
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrom(s, start, i)) {
                com.add(s.substring(start, i + 1));  // Choose
                backtracking(s, i + 1, com, ans);    // Explore
                com.remove(com.size() - 1);          // Un-choose
            }
        }
    }

    // ✅ Main function that returns all palindromic partitions
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtracking(s, 0, new ArrayList<>(), ans);
        return ans;
    }
}
