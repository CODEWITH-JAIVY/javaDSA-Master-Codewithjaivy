package pairOfSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// write a java program to find a pair with a given sum in a sorted array
public class Solution {
    // 1,2,3,4,5,6,7,8
    // target  7
    // solve this  using hashmap
public  static List<List<Integer>> pairProgram ( int []arr , int target  ) {
    List<List<Integer>>res = new ArrayList<>() ;

    HashMap<Integer , Integer>map = new HashMap<>() ;
    for (int i = 0; i < arr.length; i++) {
        int compostion = target - arr[i] ;
        if(map.containsKey(compostion)) {
         List<Integer>ans = new ArrayList<>() ;
         ans.add(compostion) ;
         ans.add(arr[i]) ;
         res.add(ans) ;
        }
        map.put(arr[i] , 1 ) ;
    }
    return res  ;

}
    public static void main(String[] args) {
        int []arr= { 1,2,3,4,5,6,7,8} ;
        List<List<Integer>>res  = pairProgram  ( arr , 7 ) ;
        System.out.println(res);
    }
}
