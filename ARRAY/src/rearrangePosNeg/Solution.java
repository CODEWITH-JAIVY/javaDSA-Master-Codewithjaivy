package rearrangePosNeg;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public  static  void  rearrange( ArrayList<Integer> arr ) {
        int evenIndex  = 0  ;
        int oddIndex  = 1  ;
        int n   = arr.size()  ;
        for( int i =0  ; i< n  ; i++ ) {
            // even index  && should be positive value
            if(i % 2 == 0 && arr.get(i)< 0  ) {
                int j  =  i+1  ;

                while (j < n && arr.get(j)  <   0 ) {
                     j++   ;
                     if( j ==n )break;
                }
                rotate( arr , i , j  ) ;
            }else if (i % 2 == 1 && arr.get(i) >= 0) {
                 // odd index should be negative value
                 int j  = i+1  ;
                 while( j < n  &&  arr.get(j) >=  0   ) {
                       j++ ;
                     if( j == n  ) break;
                 }
                rotate( arr , i , j  ) ;
            }
        }

    }
     public static  void  rotate(ArrayList<Integer> arr ,int start , int end   )  {
         int temp = arr.get(end);

         for (int i = end; i > start; i--) {
             arr.set(i, arr.get(i - 1));
         }

         arr.set(start, temp);
     }
//   public static  void rearrange(ArrayList<Integer> arr) {
//        // code here
//        ArrayList<Integer> pos  = new ArrayList<>()  ;
//        ArrayList<Integer> neg  = new ArrayList<>()  ;
//
//        for( int i =0  ; i < arr.size()    ; i++ ) {
//            if( arr.get(i) >= 0 )  {
//                pos.add(arr.get(i)) ;
//            }else {
//                neg.add( arr.get(i)) ;
//            }
//        }
//arr.clear();
//        int i  =0  ;
//        int j  =0  ;
//        while(i< pos.size()  && j < neg.size  ()  ) {
//            arr.add(pos.get(i)) ;
//            arr.add(neg.get(j )) ;
//            i++ ;
//            j++ ;
//        }
//        while(i < pos.size()   ) {
//            arr.add(pos.get(i)) ;
//            i++ ;
//        }
//        while( j < neg.size ()  ) {
//            arr.add(neg.get(j )) ;
//            j++ ;
//        }
//
//    }

    public static void main(String[] args) {
        int Arr  []   =  {  9,4,-2,-1,5,0,-5,-3,2} ;
        ArrayList<Integer>arr  = new ArrayList<>();
       for( int val : Arr ) {
           arr.add(val) ;
       }

        rearrange(arr);
      for( int val  : arr  ) {
          System.out.print(val + " ");
      }

    }
}