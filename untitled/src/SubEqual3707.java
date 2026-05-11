public class SubEqual3707 {

    public static boolean scoreBalance(String s) {
        int len = s.length();
        int start = 0;
        int end = len - 1;
        int leftSum = 0;
        int rightSum = 0;

        while (start <= end) {
            leftSum += s.charAt(start) - 'a';
            rightSum += s.charAt(end) - 'a';
            start++;
            end--;

            // Check if left and right sums are balanced at any point
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "jhj";
        System.out.println(scoreBalance(s)); // Output should be true or false based on balance
    }
}
