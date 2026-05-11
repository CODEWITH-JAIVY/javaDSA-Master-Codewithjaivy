package MedianFinder295;

import java.util.PriorityQueue;

// MedianFinder class
class MedianFinder {

    // MaxHeap for left half
    private PriorityQueue<Integer> maxHeap;
    // MinHeap for right half
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a); // max heap
        minHeap = new PriorityQueue<>();               // min heap
    }

    public void addNum(int num) {
        // Step 1: add to maxHeap
        maxHeap.offer(num);

        // Step 2: move largest from maxHeap to minHeap
        minHeap.offer(maxHeap.poll());

        // Step 3: balance sizes
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        MedianFinder medianFinder = new MedianFinder();

        medianFinder.addNum(1);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian()); // 1.5

        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian()); // 2.0

        medianFinder.addNum(4);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(5);
        System.out.println(medianFinder.findMedian()); // 3.0
    }
}