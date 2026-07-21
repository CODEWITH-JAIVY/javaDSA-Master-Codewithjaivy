import java.util.Arrays;

class Solution {
    public static boolean isMiddleElementUnique(int[] nums) {

        Arrays.sort(nums);

        int len = nums.length;
        if (len == 1) return false;
        int mid = len / 2;
        if (nums[mid - 1] == nums[mid] || nums[mid + 1] == nums[mid]) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nums [] = { 1, 2 , 2 } ;
         boolean ans  =  isMiddleElementUnique(nums) ;
        System.out.println(ans);
    }
}