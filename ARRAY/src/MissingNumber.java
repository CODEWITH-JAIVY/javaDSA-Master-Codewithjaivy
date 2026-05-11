public class MissingNumber {

// Given an array of N-1 integers in range [1, N], find the missing number using O(1) extra space.

    public  static  int findMissin(int []arr ) {
        int n  = arr.length  + 1  ;
        int excepted   =  n * (n +1 ) /2    ;

        int actaul  = 0  ;
        for( int val : arr ) actaul+= val ;
        return  excepted - actaul  ;
    }


    public static void main(String[] args) {
        int [] arr  = { 1,2,4,5 } ;
        int  n  = arr.length  ;

        int ans  = findMissin( arr ) ;
        System.out.println("Missing number in the array is " + ans );
    }
}