package com.GroupAnagrams49;

import java.util.*;

class Solution {

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int count[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        for (int val : count) {
            if (val != 0) return false;
        }
        return true;
    }

    public static void grpAnagram(String[] str, List<List<String>> Ans) {

        boolean visited[] = new boolean[str.length];

        for (int i = 0; i < str.length; i++) {

            if (visited[i]) continue; // already grouped

            List<String> group = new ArrayList<>();
            group.add(str[i]);  // current word
            visited[i] = true;

            for (int j = i + 1; j < str.length; j++) {
                if (!visited[j] && checkAnagram(str[i], str[j])) {
                    group.add(str[j]);
                    visited[j] = true;
                }
            }

            Ans.add(group); // add this anagram group
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> Ans = new ArrayList<>();
        grpAnagram(strs, Ans);
        return Ans;
    }

public static List<List<String>> groupAnagramssuinhgMap(String [] str ) {
        Map<String , List<String>> map = new HashMap<>() ;

        for( String s  :  str) {
            char[]arr = s.toCharArray();
            Arrays.sort(arr);
            String key  = new String(arr) ;
            if(!map.containsKey(key)) {
                map.put(key , new ArrayList<>()) ;
            }
            map.get(key).add(s);
        }
        return  new ArrayList<>(map.values()) ;
}


        public static void main(String[] args) {

            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

            Solution s = new Solution();
//            List<List<String>> result = s.groupAnagrams(strs);

            List<List<String>> result = s.groupAnagramssuinhgMap(strs);

            // Print the groups
            for (List<String> group : result) {
                System.out.println(group);
            }
        }
    }


