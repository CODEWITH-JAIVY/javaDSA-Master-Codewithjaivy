import java.util.HashMap;

public class ContainsDuplicateII {
    public  static  boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the number is already in the map and the difference in indices is <= k
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true; // Found duplicates within the range k
            }

            // Update the index of the current number
            map.put(nums[i], i);
        }

        return false; // No duplicates found within range k
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
        int[] arr1 = {1, 2, 3, 1};

        // Test with different inputs
        Boolean result = containsNearbyDuplicate(arr1, 3);
        System.out.println(result); // Output: true

        result = containsNearbyDuplicate(arr, 2);
        System.out.println(result); // Output: false
    }
}
