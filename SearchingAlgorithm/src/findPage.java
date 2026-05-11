class Solution {

  public  static boolean isValids ( int []arr ,int staudent ,int maxPage )  {

      int countSudent  = 1 ;
      int allocated =  0 ;
      for( int i  = 0 ;i  < arr.length  ; i++ ) {
          if( arr[i] > maxPage ) return   false ;

          if( arr[i] + allocated > maxPage ) {
              countSudent  ++  ;
              allocated = arr[i] ;

              if( countSudent > staudent )  return  false ;
          }
          else  {
              allocated +=  arr[i] ;
          }
      }
      return  true  ;
  }

    public   static   int findPages(int[] arr, int k) {
        int sum  = 0  ;
        for( int val  : arr ) {
            sum  +=  val  ;
        }
        // search space define
        int start  =0 ;
        int end = sum ;

        int ans = -1  ;
        while (start  < end ) {
            int mid  = start +( end  - start ) /2  ;

            if( isValids ( arr , k , mid )) {
                ans  = mid ;
                end = mid  -1 ;;
            }else {
                start = mid +1  ;
            }
        }
        return ans  ;
    }

    public static void main(String[] args) {
        int [] arr = { 12, 34, 67, 90 } ;
        System.out.println( findPages(arr , 2 ));
     }
}