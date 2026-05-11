import java.util.ArrayList;

class Solution {

    // Multiply function: manually multiplies big number stored in list by an integer
    public static int multiply(ArrayList<Integer> list, int size, int multiplier) {
        int carry = 0;

        for (int i = 0; i < size; i++) {
            int res = list.get(i) * multiplier + carry;
            list.set(i, res % 10);
            carry = res / 10;
        }

        while (carry > 0) {
            list.add(carry % 10);
            carry = carry / 10;
            size++;
        }

        return size;
    }

    // Compute factorial and return as String
    public static String factorialAsString(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // Initial value: 1
        int size = 1;

        for (int multiplier = 2; multiplier <= n; multiplier++) {
            size = multiply(list, size, multiplier);
        }

        // Convert list of digits (stored in reverse) to string
        StringBuilder result = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.append(list.get(i));
        }

        return result.toString();
    }

        public static void main(String[] args) {
            int n = 88;

            String factorial = Solution.factorialAsString(n);
            System.out.println("Factorial of " + n + " is:");
            System.out.print (factorial);
        }
    }


