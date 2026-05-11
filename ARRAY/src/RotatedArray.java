public class RotatedArray {

        public static void rotate(int[] nums, int k) {
            if( nums.length == 1 )
            {for( int num : nums ) {
                    System.out.print ( num + " ");
                }
            } else {
                int   i  = 0 ,  j = 0 ;
                while ( i < k  ) {
                    int tem = 0 ;
                    for ( j = nums.length -1 ;  j  > 0  ; j-- ) {
                        if( tem == 0 )
                        {
                            tem = nums[j] ;
                        }
                        nums[j] = nums[j-1] ;
                    }
                    nums[j] =tem  ;
                    i++ ;
                }
                for( int num : nums ) {
                    System.out.print ( num + " ");
                }
            }
        }
    public  static void  Rotatedarray( int  [] arr , int k  ) {
            int len = arr.length;
            int [] tem   = new int[len] ;
            k =  k  %  len ;
        for (int i = 0; i <= arr.length-1; i++) {
            tem[ (i + k ) % len ] = arr[i] ;
        }
        for( int i =0  ; i <= tem.length -1 ; i ++ ) {
            arr[i] = tem[i] ;
        }
        System.out.println("After rotating the Array by  "+  k  +  " ");
        for (int value  : arr  ) {
            System.out.print( value + "  ");
        }
    }

    public  static  void  reverce(int [] arr  , int start ,int end ) {
            while( start <= end ) {
                int tem  = arr[end] ;
                arr[end] = arr[start] ;
                arr[start] = tem ;
                start++ ;
                end --   ;
            }
    }
    public  static void RotateArray( int []arr  , int k ) {
         int len   = arr.length -1  ;
        if(len <=  0 ||  k == 1 ) {
            System.out.println("Roted here ");
            return;
        }else {
            k =  k % len ;
            reverce( arr, 0 , len  ) ;
            reverce( arr , 0 , k-1) ;
            reverce( arr , k , len ) ;
        }
//        reverce( arr , 0  , len  ) ;
//         reverce(arr , 0  , pos-1);
//         reverce(arr , pos , len );
        System.out.println("Roteated Array ");
        for (int value  : arr ) {
            System.out.print(value + "  " );
        }
    }

    public static void main(String[] args) {
        int [] arr = {  1 , 2   } ;
//        rotate( arr  , 3 ) ;
//       Rotatedarray ( arr , 3 ) ;
        RotateArray( arr  ,   1  ) ;

    }
}