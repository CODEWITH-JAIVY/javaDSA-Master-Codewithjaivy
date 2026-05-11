package TwoSumleetcode1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer > map  = new HashMap<>() ;

        for( int i = 0 ; i< nums.length ; i++  ) {
            int val = target - nums[i] ;
            if(map.containsKey(val)) {
                return  new int []  { map.get(val) ,  i } ;
            }
           map.put(nums[i] , i ) ;
        }
        return new int[]{} ;
    }

    static void main() {
        Solution obj  = new Solution() ;
        int [] arr  = { 2,7,11,15} ;
        int [] ans = new int[2] ;
        ans = obj.twoSum(arr , 9 ) ;
        for( int  val : ans ) {
            System.out.println(val);
        }
    }
}