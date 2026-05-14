import java.util.Arrays;

public class RotateArrayByKposition {

    ///  Rotate an array by K positions
     public static  int [] rotate(int [] arr , int k   ) {
            k  = k %   arr.length   ;
            int n  = arr.length ;
            int [] ans  =  new  int[n] ;
            for (int i =0 ; i<n ;i++ ) {
                int index  =  (i+k ) % n    ;
                ans[index] =arr[i]  ;
            }
            return ans  ;
     }
    public static void main(String[] args) {
        int  [] arr  =  {  1,2,3,4,5,6,7,8,9,10 }  ;

        arr  = rotate(arr , 3 ) ;
        for(int val  : arr ) {
            System.out.print (val +"  "  );
        }
    }
}