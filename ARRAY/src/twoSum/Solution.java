package twoSum;

import java.util.HashMap;

public class Solution {
    public static  int[] twoSum(int[] numbers, int target) {
        HashMap<Integer , Integer > map  = new HashMap <> ()   ;
        int n  = numbers.length  ;
        for( int i  =    0 ; i<=  n  ;  i++   ) {
            if( map.containsKey(numbers[i])) {
                return new int [] { map.get( numbers[i]) +1  ,  i+1   } ;
            }
            int sub    = target - numbers[i] ;
            map.put(sub , i )  ;
        }
        return new int  [0] ;
    }

    public static void main(String[] args) {
        int arr  []   = { 2,7,11,15 } ;
        int [] ans  =  twoSum(arr , 9 )    ;
        for (int val  : ans ) {
            System.out.print( val  +"  ");
        }
    }
}