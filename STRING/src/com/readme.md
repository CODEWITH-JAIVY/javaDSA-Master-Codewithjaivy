# 🧵 String DSA — Complete Study Guide

> Java-based | Covers Level 1–4 + Must-Do LeetCode + Concepts

---

## 📚 Study Order of Concepts

| Order | Concept |
|-------|---------|
| 1 | String Traversal |
| 2 | Character Arrays |
| 3 | Frequency Counting (HashMap, Array[26]) |
| 4 | Two Pointers |
| 5 | Sliding Window |
| 6 | StringBuilder |
| 7 | Hashing |
| 8 | Pattern Matching |
| 9 | Trie Basics |
| 10 | KMP & Rabin-Karp |

---

## 🟢 Level 1 — String Basics (Problems 1–10)

---

### 1. Reverse a String

**Approach:** Two pointer — swap from both ends.

```java
public String reverse(String s) {
    char[] arr = s.toCharArray();
    int left = 0, right = arr.length - 1;
    while (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    return new String(arr);
}
```

---

### 2. Check if a String is Palindrome

**Approach:** Compare characters from both ends.

```java
public boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
    }
    return true;
}
```

---

### 3. Count Vowels and Consonants

**Approach:** Traverse string, check if each char is a vowel or consonant.

```java
public void countVowelsConsonants(String s) {
    s = s.toLowerCase();
    int vowels = 0, consonants = 0;
    String vowelSet = "aeiou";
    for (char c : s.toCharArray()) {
        if (Character.isLetter(c)) {
            if (vowelSet.indexOf(c) != -1) vowels++;
            else consonants++;
        }
    }
    System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
}
```

---

### 4. Convert Lowercase to Uppercase (without built-in)

**Approach:** ASCII difference between 'a' and 'A' is 32. Subtract 32 to convert.

```java
public String toUpperCase(String s) {
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 'a' && arr[i] <= 'z') {
            arr[i] = (char)(arr[i] - 32);
        }
    }
    return new String(arr);
}
```

---

### 5. Find Length of String (without length())

**Approach:** Use `toCharArray()` and count manually, or use exception trick.

```java
public int findLength(String s) {
    int count = 0;
    for (char c : s.toCharArray()) count++;
    return count;
}
```

---

### 6. Count Frequency of Each Character

**Approach:** Use `int[26]` array for lowercase letters.

```java
public void charFrequency(String s) {
    int[] freq = new int[26];
    for (char c : s.toCharArray()) freq[c - 'a']++;
    for (int i = 0; i < 26; i++) {
        if (freq[i] > 0)
            System.out.println((char)('a' + i) + " -> " + freq[i]);
    }
}
```

---

### 7. Remove Spaces from a String

**Approach:** Use StringBuilder, skip spaces.

```java
public String removeSpaces(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (c != ' ') sb.append(c);
    }
    return sb.toString();
}
```

---

### 8. Check if Two Strings are Equal

**Approach:** Compare character by character (no `.equals()`).

```java
public boolean areEqual(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) return false;
    }
    return true;
}
```

---

### 9. Find First Non-Repeating Character

**Approach:** Frequency array → find first char with freq == 1.

```java
public char firstNonRepeating(String s) {
    int[] freq = new int[26];
    for (char c : s.toCharArray()) freq[c - 'a']++;
    for (char c : s.toCharArray()) {
        if (freq[c - 'a'] == 1) return c;
    }
    return '_'; // Not found
}
```

---

### 10. Find First Repeating Character

**Approach:** Use a HashSet — first char already in set is the answer.

```java
public char firstRepeating(String s) {
    Set<Character> seen = new HashSet<>();
    for (char c : s.toCharArray()) {
        if (!seen.add(c)) return c;
    }
    return '_'; // Not found
}
```

---

## 🟡 Level 2 — Character Frequency & Hashing (Problems 11–20)

---

### 11. Valid Anagram

**Approach:** Two frequency arrays of size 26. Compare them.

```java
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }
    for (int c : count) if (c != 0) return false;
    return true;
}
```

---

### 12. Ransom Note

**Approach:** Count chars in magazine. Check if note can be formed.

```java
public boolean canConstruct(String ransomNote, String magazine) {
    int[] freq = new int[26];
    for (char c : magazine.toCharArray()) freq[c - 'a']++;
    for (char c : ransomNote.toCharArray()) {
        if (--freq[c - 'a'] < 0) return false;
    }
    return true;
}
```

---

### 13. Find Duplicate Characters

**Approach:** Frequency array — print chars with freq > 1.

```java
public void findDuplicates(String s) {
    int[] freq = new int[26];
    for (char c : s.toCharArray()) freq[c - 'a']++;
    for (int i = 0; i < 26; i++) {
        if (freq[i] > 1)
            System.out.println((char)('a' + i) + " appears " + freq[i] + " times");
    }
}
```

---

### 14. Sort Characters by Frequency

**Approach:** HashMap for frequency → sort by value → build result.

```java
public String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

    List<Character> chars = new ArrayList<>(map.keySet());
    chars.sort((a, b) -> map.get(b) - map.get(a));

    StringBuilder sb = new StringBuilder();
    for (char c : chars) {
        for (int i = 0; i < map.get(c); i++) sb.append(c);
    }
    return sb.toString();
}
```

---

### 15. Most Frequent Character

**Approach:** Frequency array → find max.

```java
public char mostFrequent(String s) {
    int[] freq = new int[26];
    for (char c : s.toCharArray()) freq[c - 'a']++;
    int maxIdx = 0;
    for (int i = 1; i < 26; i++) {
        if (freq[i] > freq[maxIdx]) maxIdx = i;
    }
    return (char)('a' + maxIdx);
}
```

---

### 16. Check if String Contains All Unique Characters

**Approach:** Use a boolean[26] or HashSet.

```java
public boolean allUnique(String s) {
    boolean[] seen = new boolean[26];
    for (char c : s.toCharArray()) {
        if (seen[c - 'a']) return false;
        seen[c - 'a'] = true;
    }
    return true;
}
```

---

### 17. Group Anagrams

**Approach:** Sort each word → use as HashMap key → group words with same key.

```java
public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
    }
    return new ArrayList<>(map.values());
}
```

---

### 18. Find Common Characters Between Two Strings

**Approach:** Use two frequency arrays → take min of each.

```java
public List<Character> commonChars(String s1, String s2) {
    int[] freq1 = new int[26], freq2 = new int[26];
    for (char c : s1.toCharArray()) freq1[c - 'a']++;
    for (char c : s2.toCharArray()) freq2[c - 'a']++;
    List<Character> result = new ArrayList<>();
    for (int i = 0; i < 26; i++) {
        int times = Math.min(freq1[i], freq2[i]);
        for (int j = 0; j < times; j++) result.add((char)('a' + i));
    }
    return result;
}
```

---

### 19. Isomorphic Strings

**Approach:** Two maps — s→t and t→s mapping must be consistent.

```java
public boolean isIsomorphic(String s, String t) {
    Map<Character, Character> sToT = new HashMap<>();
    Map<Character, Character> tToS = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        char sc = s.charAt(i), tc = t.charAt(i);
        if (sToT.containsKey(sc) && sToT.get(sc) != tc) return false;
        if (tToS.containsKey(tc) && tToS.get(tc) != sc) return false;
        sToT.put(sc, tc);
        tToS.put(tc, sc);
    }
    return true;
}
```

---

### 20. Word Pattern

**Approach:** Same as Isomorphic — map pattern chars to words and vice versa.

```java
public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (pattern.length() != words.length) return false;
    Map<Character, String> cToW = new HashMap<>();
    Map<String, Character> wToC = new HashMap<>();
    for (int i = 0; i < pattern.length(); i++) {
        char c = pattern.charAt(i);
        String w = words[i];
        if (cToW.containsKey(c) && !cToW.get(c).equals(w)) return false;
        if (wToC.containsKey(w) && wToC.get(w) != c) return false;
        cToW.put(c, w);
        wToC.put(w, c);
    }
    return true;
}
```

---

## 🟠 Level 3 — Two Pointers (Problems 21–25)

---

### 21. Reverse Words in a String

**Approach:** Split by spaces → reverse array → join.

```java
public String reverseWords(String s) {
    String[] words = s.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
        sb.append(words[i]);
        if (i != 0) sb.append(" ");
    }
    return sb.toString();
}
```

---

### 22. Valid Palindrome II (Remove at Most One Character)

**Approach:** Two pointers. On mismatch, try skipping left OR right char — check if either is palindrome.

```java
public boolean validPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return isPalin(s, left + 1, right) || isPalin(s, left, right - 1);
        }
        left++; right--;
    }
    return true;
}
private boolean isPalin(String s, int l, int r) {
    while (l < r) {
        if (s.charAt(l++) != s.charAt(r--)) return false;
    }
    return true;
}
```

---

### 23. Merge Strings Alternately

**Approach:** Use two pointers, pick one char from each string alternately.

```java
public String mergeAlternately(String word1, String word2) {
    StringBuilder sb = new StringBuilder();
    int i = 0, j = 0;
    while (i < word1.length() && j < word2.length()) {
        sb.append(word1.charAt(i++));
        sb.append(word2.charAt(j++));
    }
    while (i < word1.length()) sb.append(word1.charAt(i++));
    while (j < word2.length()) sb.append(word2.charAt(j++));
    return sb.toString();
}
```

---

### 24. Reverse Only Letters

**Approach:** Two pointers — skip non-letters, swap only letter characters.

```java
public String reverseOnlyLetters(String s) {
    char[] arr = s.toCharArray();
    int left = 0, right = arr.length - 1;
    while (left < right) {
        while (left < right && !Character.isLetter(arr[left])) left++;
        while (left < right && !Character.isLetter(arr[right])) right--;
        char temp = arr[left]; arr[left] = arr[right]; arr[right] = temp;
        left++; right--;
    }
    return new String(arr);
}
```

---

### 25. Backspace String Compare

**Approach:** Process each string with a stack (or StringBuilder) simulating backspace (`#`), then compare.

```java
public boolean backspaceCompare(String s, String t) {
    return process(s).equals(process(t));
}
private String process(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (c == '#') { if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); }
        else sb.append(c);
    }
    return sb.toString();
}
```

---

## 🔴 Level 4 — Sliding Window (Problems 26–30)

---

### 26. Longest Substring Without Repeating Characters

**Approach:** Sliding window + HashMap storing last seen index of each char.

```java
public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int max = 0, left = 0;
    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        if (map.containsKey(c)) left = Math.max(left, map.get(c) + 1);
        map.put(c, right);
        max = Math.max(max, right - left + 1);
    }
    return max;
}
```

**Time:** O(n) | **Space:** O(min(n, 26))

---

### 27. Longest Repeating Character Replacement

**Approach:** Sliding window. Track max frequency char in window. If `(window size - maxFreq) > k`, shrink left.

```java
public int characterReplacement(String s, int k) {
    int[] count = new int[26];
    int left = 0, maxFreq = 0, result = 0;
    for (int right = 0; right < s.length(); right++) {
        maxFreq = Math.max(maxFreq, ++count[s.charAt(right) - 'A']);
        while ((right - left + 1) - maxFreq > k) count[s.charAt(left++) - 'A']--;
        result = Math.max(result, right - left + 1);
    }
    return result;
}
```

**Time:** O(n) | **Space:** O(26)

---

### 28. Permutation in String

**Approach:** Sliding window of size `s1.length()`. Compare frequency arrays.

```java
public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;
    int[] need = new int[26], window = new int[26];
    for (char c : s1.toCharArray()) need[c - 'a']++;
    int k = s1.length();
    for (int i = 0; i < s2.length(); i++) {
        window[s2.charAt(i) - 'a']++;
        if (i >= k) window[s2.charAt(i - k) - 'a']--;
        if (Arrays.equals(need, window)) return true;
    }
    return false;
}
```

**Time:** O(n) | **Space:** O(26)

---

### 29. Minimum Window Substring

**Approach:** Sliding window with two pointers. Expand right to include all `t` chars. Then shrink left to minimize.

```java
public String minWindow(String s, String t) {
    int[] need = new int[128];
    for (char c : t.toCharArray()) need[c]++;
    int left = 0, minLen = Integer.MAX_VALUE, start = 0, count = t.length();
    for (int right = 0; right < s.length(); right++) {
        if (need[s.charAt(right)]-- > 0) count--;
        while (count == 0) {
            if (right - left + 1 < minLen) { minLen = right - left + 1; start = left; }
            if (++need[s.charAt(left++)] > 0) count++;
        }
    }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
}
```

**Time:** O(n + m) | **Space:** O(128)

---

### 30. Find All Anagrams in a String

**Approach:** Sliding window of size `p.length()`. Compare freq arrays at each position.

```java
public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    int[] need = new int[26], window = new int[26];
    for (char c : p.toCharArray()) need[c - 'a']++;
    int k = p.length();
    for (int i = 0; i < s.length(); i++) {
        window[s.charAt(i) - 'a']++;
        if (i >= k) window[s.charAt(i - k) - 'a']--;
        if (Arrays.equals(need, window)) result.add(i - k + 1);
    }
    return result;
}
```

**Time:** O(n) | **Space:** O(26)

---

## ⭐ Must-Do LeetCode Problems

| # | Problem | Difficulty | Key Technique |
|---|---------|------------|---------------|
| 125 | Valid Palindrome | Easy | Two Pointers |
| 242 | Valid Anagram | Easy | Frequency Array |
| 387 | First Unique Character in a String | Easy | Frequency Array |
| 344 | Reverse String | Easy | Two Pointers |
| 205 | Isomorphic Strings | Easy | Two HashMaps |
| 3 | Longest Substring Without Repeating Characters | Medium | Sliding Window |
| 49 | Group Anagrams | Medium | HashMap + Sorting |
| 567 | Permutation in String | Medium | Sliding Window |
| 438 | Find All Anagrams in a String | Medium | Sliding Window |
| 76 | Minimum Window Substring | Hard | Sliding Window |

---

## 🧠 Concept Quick Reference

### Frequency Counting — Two Ways

```java
// Method 1: int[26] — for lowercase only (faster, O(1) lookup)
int[] freq = new int[26];
freq[c - 'a']++;

// Method 2: HashMap — for any character
Map<Character, Integer> map = new HashMap<>();
map.put(c, map.getOrDefault(c, 0) + 1);
```

### Sliding Window Template

```java
int left = 0;
for (int right = 0; right < s.length(); right++) {
    // 1. Add s[right] to window

    // 2. Check if window is valid
    while (/* window invalid */) {
        // 3. Remove s[left] from window
        left++;
    }

    // 4. Update answer
}
```

### Two Pointer Template

```java
int left = 0, right = s.length() - 1;
while (left < right) {
    // process s[left] and s[right]
    left++;
    right--;
}
```

### StringBuilder (Performance Tip)

```java
// Always use StringBuilder for string building in loops
// String concatenation (+=) in loop = O(n²) — avoid!
StringBuilder sb = new StringBuilder();
sb.append(c);
sb.deleteCharAt(sb.length() - 1);
sb.toString();
```

---

## 📊 Time & Space Complexity Summary

| Problem | Time | Space |
|---------|------|-------|
| Reverse String | O(n) | O(1) |
| Valid Palindrome | O(n) | O(1) |
| Valid Anagram | O(n) | O(26) |
| Group Anagrams | O(n·k·log k) | O(n) |
| Isomorphic Strings | O(n) | O(n) |
| Longest Substring No Repeat | O(n) | O(n) |
| Character Replacement | O(n) | O(26) |
| Permutation in String | O(n) | O(26) |
| Find All Anagrams | O(n) | O(26) |
| Minimum Window Substring | O(n+m) | O(n) |

---

*Happy Coding, Sanjeet! 🚀 — String mastery aata hai practice se, ek problem ek din!*