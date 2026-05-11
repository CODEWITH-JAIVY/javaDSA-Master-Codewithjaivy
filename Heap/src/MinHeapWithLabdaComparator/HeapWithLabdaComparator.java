package MinHeapWithLabdaComparator;

import java.util.PriorityQueue;

public class HeapWithLabdaComparator {

    // Min-heap using lambda comparator
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> a-b
    );

    // Insert element
    public void add(int val) {
        minHeap.add(val);
    }

    // Return smallest element (does NOT remove)
    public int peek() {
        return minHeap.peek();
    }

    // Remove and return smallest element
    public int poll() {
        return minHeap.poll();
    }

    // Check if heap is empty
    public boolean isEmpty() {
        return minHeap.isEmpty();
    }

    // Size of heap
    public int size() {
        return minHeap.size();
    }

    public static void main(String[] args) {

        HeapWithLabdaComparator heap = new HeapWithLabdaComparator();

        heap.add(10);
        heap.add(3);
        heap.add(7);
        heap.add(1);

        System.out.println("Min element: " + heap.peek());  // 1

        while (!heap.isEmpty()) {
            System.out.print(heap.poll() + " ");  // 1 3 7 10
        }
    }
}