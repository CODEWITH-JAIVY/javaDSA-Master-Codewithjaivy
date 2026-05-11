import topKFrequent347.topKFrequent;

import java.util.*;

public class topKFrequent692 {
    public static List<String> topKFrequent(String[] words, int k) {
        // 1. Count frequencies
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        // 2. Min-heap by (freq ASC, word DESC)
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int fa = freq.get(a);
            int fb = freq.get(b);
            if (fa != fb) return fa - fb;       // smaller frequency = smaller priority
            return b.compareTo(a);              // for same freq, lexicographically larger = smaller priority
        });

        // 3. Keep heap size <= k
        for (String w : freq.keySet()) {
            pq.offer(w);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // 4. Build result from heap (will be reversed order)
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result); // highest freq & lexicographically smallest first
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"} ;
        List<String>ans  = new ArrayList<>();
         ans = topKFrequent(words , 2 ) ;
         for(String ch  : ans) {
             System.out.print(ch +" ");
         }
    }
}