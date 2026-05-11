public class PalindromeNumberUsingRecursion {
    static int sum = 0;

    // helper function to reverse the number
    public static void reverse(int num) {
        if (num == 0) {
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        reverse(num / 10);
    }

    public static boolean palindrome(int num) {
        sum = 0; // reset before using
        reverse(num);
        return num == sum;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(12789)); // false
        System.out.println(palindrome(1221));  // true
    }
}
