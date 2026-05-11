package com.combinationSum;

import java.util.ArrayList;
import java.util.List;

public class Combination {
  public static void ComSum(int[] arr, int i, List<Integer> Comb, List<List<Integer>> ans, int target)  {
      if(i == arr.length || target <0 ) {
          return   ;
      }
      if(target == 0 ) {
          ans.add(new ArrayList<>(Comb)) ; // add a  copy of Comb
          return    ;
      }
        Comb.add(arr[i]) ; // single inclusion and include the current number
      ComSum(arr , i , Comb , ans , target -arr[i]) ;  // same index are allowed
        // now backTracing  for the insert  current element in the Comb ( arr  )
              Comb.remove( Comb.size()-1 )  ; // backtraking
         ComSum(arr , i +1 , Comb , ans , target  ); //  // Exclude the current number and move to next

    }
        public static  List<List<Integer>> combinationSum(int[] arr , int target) {
            List<Integer>Comb =  new ArrayList<>() ;
            int i  = 0  ;
            List<List<Integer>> ans = new ArrayList<>() ;
              ComSum( arr , i , Comb , ans , target ) ;
              return  ans ;
        }

    public static void main(String[] args) {
      int [] arr  = {  2,3,5} ;
        List<List<Integer>>  ans =  combinationSum(arr , 8 ) ;
        System.out.println(ans);
    }
}
