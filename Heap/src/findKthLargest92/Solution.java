 package findKthLargest92;

import java.util.PriorityQueue;

class Solution {
     public static int findKthLargest(int[] nums, int k) {
        // Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k)
                System.out.println("Remove "+ pq.poll());   // remove smallest
        }

        return pq.peek(); // root is kth largest
    }

    public static void main(String[] args) {
        int [] nums  = { 3,2,3,1,2,4,5,5,6 } ;
        int  kth  = findKthLargest(nums  , 4 ) ;
        System.out.println(kth);
    }
}