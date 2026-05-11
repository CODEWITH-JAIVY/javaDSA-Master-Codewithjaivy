import java.util.Arrays;
import java.util.Scanner;

public class CompletlySortedTwoDArray {

    static int[] Search(int[][] Matrix, int target) {
        int RowLow = 0, Rowhight = Matrix.length - 1, Col = Matrix[0].length - 1;

        while (RowLow <= Rowhight) {
            int RowMid = RowLow + (Rowhight - RowLow) / 2;

            if (target >= Matrix[RowMid][0] && target <= Matrix[RowMid][Col]) {
                // Apply binary search on this row
                int index = Arrays.binarySearch(Matrix[RowMid], target);
                if (index >= 0) {
                    return new int[]{RowMid, index};
                } else {
                    return new int[]{-1, -1}; // not found in row
                }
            } else if (target > Matrix[RowMid][Col]) {
                RowLow = RowMid + 1;   // search below
            } else {
                Rowhight = RowMid - 1; // search above
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] Matrix = {
                {5, 7, 8, 9},
                {10, 11, 13, 14},
                {15, 17, 18, 19},
                {20, 22, 25, 26},
                {30, 35, 38, 39, 40}
        };

        System.out.print("Enter target: ");
        int target = scanner.nextInt();

        int[] result = Search(Matrix, target);
        System.out.println(Arrays.toString(result));
    }
}
