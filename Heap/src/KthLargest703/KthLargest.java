package KthLargest703;

import java.util.PriorityQueue;
public class KthLargest {
    private PriorityQueue<Integer> minheap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minheap = new PriorityQueue<>(); // min-heap by default

        for (int val : nums) {
            add(val); // reuse logic
        }
    }

    public int add(int val) {
        minheap.offer(val);

        if (minheap.size() > k) {
            minheap.poll(); // remove smallest
        }

        return minheap.peek(); // kth largest
    }

    static void main() {
        int [] nums  = { 12,3,4,5,6,2,0} ;
        KthLargest obj = new KthLargest(3 , nums) ;
        System.out.println(obj.add(5));
    }
}