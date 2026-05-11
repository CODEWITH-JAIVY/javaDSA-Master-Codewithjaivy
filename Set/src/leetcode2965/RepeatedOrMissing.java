package leetcode2965;

import java.util.HashSet;
import java.util.Set;

public class RepeatedOrMissing {
    public  static  int [] findMissing(int [][] arr) {
        int [] result = new int[2] ;
        Set<Integer>set = new HashSet<>() ;
          long totalSum  = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                int val = arr[i] [j] ;
                if( set.contains(val)) {
                     result[0]= val  ;
                }
                totalSum = totalSum + val ;
                set.add(val) ;
            }
        }
        int n = arr.length;
        int totalNumber =  n * n  ;
        int expectedSum = totalNumber * (totalNumber+1) / 2  ;
        result[1] = Math.toIntExact(expectedSum - (totalSum- result[0] ));
        return result  ;
    }

    public static void main(String[] args) {
        int [][]arr = { {1,2}  ,  {2,3} } ;
        int res[] = findMissing(arr) ;
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}