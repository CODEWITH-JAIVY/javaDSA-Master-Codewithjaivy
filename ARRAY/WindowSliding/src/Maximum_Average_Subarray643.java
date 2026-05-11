public class Maximum_Average_Subarray643 {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0, maxSum = 0;
        // find the sum of the 1st k element
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k]; // add new element and remove old element

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }

    public static void main(String[] args) {
        int arr[] = {1, 12, -5, -6, 50, 3};
        double result = findMaxAverage(arr, 4);
        System.out.println(result);
    }
}