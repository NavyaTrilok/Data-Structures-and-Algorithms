import java.util.PriorityQueue;
import java.util.Collections;

class MedianFinder {

    // Max-heap for the smaller half
    private PriorityQueue<Integer> left_max_heap;

    // Min-heap for the larger half
    private PriorityQueue<Integer> right_min_heap;

    public MedianFinder() {
        left_max_heap = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap
        right_min_heap = new PriorityQueue<>(); // Min-heap
    }

    public void addNum(int num) {
        // Step 1: Add to max heap (left)
        if (left_max_heap.isEmpty() || num <= left_max_heap.peek()) {
            left_max_heap.add(num);
        } else {
            right_min_heap.add(num);
        }

        // Step 2: Balance the heaps
        if (left_max_heap.size() > right_min_heap.size() + 1) {
            right_min_heap.add(left_max_heap.poll());
        } else if (right_min_heap.size() > left_max_heap.size()) {
            left_max_heap.add(right_min_heap.poll());
        }
    }

    public double findMedian() {
        if (left_max_heap.size() == right_min_heap.size()) {
            return (left_max_heap.peek() + right_min_heap.peek()) / 2.0;
        } else {
            return left_max_heap.peek(); // will always be 1 more than right heap
        }
    }
}
