package kSmallestPairs373;

import java.util.*;

class Solution {

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<int[]> listcurr = new ArrayList<>();
        for (int a : nums1) {
            for (int b : nums2) {
                listcurr.add(new int[]{a, b});
            }
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> (a[0] + a[1]) - (b[0] + b[1])
        );

        for (int[] arr : listcurr)
            minHeap.offer(arr);

        List<List<Integer>> ans = new ArrayList<>();

        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] curr = minHeap.remove();
            ans.add(Arrays.asList(curr[0], curr[1]));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> ans = kSmallestPairs(nums1, nums2, 2);

        for (List<Integer> val : ans) {   // ✅ Correct
            System.out.println(val);
        }
    }
}