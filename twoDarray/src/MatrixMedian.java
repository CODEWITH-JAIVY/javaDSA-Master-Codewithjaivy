public class MatrixMedian {

    // Helper to count elements ≤ target in a row (since row is sorted)
    private static int countLessThanOrEqual(int[] row, int target) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (row[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int findMedian(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find global min and max in the matrix
        for (int i = 0; i < n; i++) {
            low = Math.min(low, mat[i][0]);           // first element in each row
            high = Math.max(high, mat[i][m - 1]);     // last element in each row
        }

        int desiredCount = (n * m) / 2;

        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;

            // Count elements ≤ mid across all rows
            for (int i = 0; i < n; i++) {
                count += countLessThanOrEqual(mat[i], mid);
            }

            if (count <= desiredCount) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };
        System.out.println("Median is: " + findMedian(mat1)); // Output: 5

//        int[][] mat2 = {
//                {2, 4, 9},
//                {3, 6, 7},
//                {4, 7, 10}
//        };
//        System.out.println("Median is: " + findMedian(mat2)); // Output: 6
//
//        int[][] mat3 = {
//                {3},
//                {4},
//                {8}
//        };
//        System.out.println("Median is: " + findMedian(mat3)); // Output: 4
    }
}
