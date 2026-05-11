import java.util.ArrayList;
import java.util.List;

public class insertInterval57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Step 1: Add intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // Step 2: Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {

            newInterval[0] =
                    Math.min(newInterval[0], intervals[i][0]);

            newInterval[1] =
                    Math.max(newInterval[1], intervals[i][1]);

            i++;
        }

        // Add merged interval
        ans.add(newInterval);

        // Step 3: Add remaining intervals
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {

        insertInterval57  sol = new insertInterval57();

        int[][] intervals = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[] newInterval = {4, 8};

        int[][] result = sol.insert(intervals, newInterval);

        System.out.println("Merged Intervals:");

        for (int[] interval : result) {
            System.out.println(
                    "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}