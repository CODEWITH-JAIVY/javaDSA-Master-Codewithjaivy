package topKFrequent347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequent {

        public static int[] topKFrequent(int[] nums, int k) {

            // Step 1: Count frequency of each number
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            // Step 2: Create a min-heap (keeps smallest frequency at top)
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                    (a, b) -> freq.get(a) - freq.get(b)
            );

            // Step 3: Add numbers to heap and keep only top K frequent
            for (int num : freq.keySet()) {
                minHeap.offer(num);

                // If heap becomes larger than k, remove the least frequent number
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }

            // Step 4: Build result array from heap
            int[] result = new int[k];
            int index = 0;
            while (!minHeap.isEmpty()) {
                result[index++] = minHeap.poll();
            }

            return result;
        }

    public static void main(String[] args) {
        int [] arr  = { 1,1,1,2,2,3} ;
        int ans[] = new int[2] ;
       ans =  topKFrequent(arr , 2 ) ;
       for( int val : ans ) {
           System.out.print( val + " ");
       }
    }
    }