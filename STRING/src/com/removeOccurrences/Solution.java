package com.removeOccurrences;

class Solution {
    public static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int k = part.length();

        for (char c : s.toCharArray()) {
            sb.append(c);

            // If current StringBuilder ends with 'part'
            if (sb.length() >= k && sb.substring(sb.length() - k).equals(part)) {
                sb.delete(sb.length() - k, sb.length());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s  = "daabcbaabcbc" ;
        String part  = "abc" ;
        System.out.println( removeOccurrences(s , part));
    }
}