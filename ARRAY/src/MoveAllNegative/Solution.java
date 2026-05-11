package MoveAllNegative;

public class Solution {
    public  static  void swap(int[]arr ,int  start ,int  end  ) {
        int temp = arr[start] ;
        arr[start] = arr[end] ;
        arr[end] = temp  ;
    }
    public static     void MoveAllNegative(int [] arr ) {
        int start  = 0 ;
        int end  = arr.length -1  ;

        while ( start <= end) {
            if(arr[start] < 0 ) {
                start ++ ;
            } else if (arr[end]>0 ) {
                end--  ;
            }
            else {
                swap(arr , start , end  ) ;
                start ++ ;
                end --  ;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 } ;
        System.out.println("Before move  \n ");
        for (int val  : arr) {
            System.out.print(val + "  ");
        }
        MoveAllNegative(arr);
        System.out.println ("After move  \n ");
        for (int val  : arr) {
            System.out.print(val + "  ");
        }
    }
}