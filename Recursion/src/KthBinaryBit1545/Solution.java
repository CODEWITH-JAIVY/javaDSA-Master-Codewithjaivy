package KthBinaryBit1545;

public class Solution {
    public char findKthBit(int n , int k  ) {
        if( n == 1 ) {
            return  '0' ; 
        }
        int len  = (1<< n ) ;  
        if( Math.ceil(len/2.0) == k ) {
            return  '1' ;  
        } else if (Math.ceil(len/2.0)  < k ) {
            return  findKthBit(n-1 , k ) ;
        }else {
            char ch  = findKthBit( n-1 , len-(k-1)) ;
            return ( ch == '0') ? '1' : '0' ;
        }
    }

}