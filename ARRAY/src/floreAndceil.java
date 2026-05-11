public class floreAndceil {
    public  static  int Flore( int [] arr , int value  )  {
        int ans  = 0 ;
        int start = 0 , end  = arr.length -1 ;
        if(arr[0]  < value ) {
            System.out.println(" there  is no flore value ");
        }
        while (start <= end ) {
            int mid = start + ( end - start ) / 2  ;
            if( arr[mid] == value) {
                return  mid  ;
            }
            else if( arr[mid] < value) {
                ans  = mid ;
                start = mid +   1 ;
            }else  {
                end = mid -1  ;
            }
        }
        System.out.println("Flore index " + (ans ) );
        return  arr[ans  ]  ;
    }
    public  static  int Ceil ( int [] arr , int value ) {
        int ans = 0 ;
        int start = 0 , end  = arr.length -1 ;
        while (start <= end ) {
            int mid = start + ( end  - start ) / 2 ;
            if( arr [mid] == value ) {
                return  mid  ;
            }
            else if(arr[mid] < value ) {
                ans = mid ;
                start= mid +1 ;
//                  = mid ;
            }else  {
                end = mid - 1 ;
            }
        }
        System.out.println ( " ceail index  "+ (ans+1 ) );
        return  arr[ans  +1 ] ;
//         if( ans == arr.length ) {
//             return
//         }
    }

  public  static  void  findFloreCeail(int []  arr  ,int value )  {
        int flore = 0 , ceil  = 0 ;
      for (int i = 0; i < arr.length ; i++) {
           if ( arr[i] == value ) {
               System.out.println("Flore and ceil index is " + i );
           }
           if( arr[i]  < value  ) {
               flore = i  ;
           }
           if( arr[i] > value ){
               ceil =  i ;
               break;
           }
      }
      System.out.println("Using brus forse appraoch ");
      System.out.println(" Flore value  " + arr[flore]);
      System.out.println("Ceil value " + arr[ceil] );
  }
    public static void main(String[] args) {
        int [] arr  = { 2,5 , 5 ,7,8,10,15,18,20,22,25 } ;
        int value =   1  ;
        int floreValue = Flore( arr , value  ) ;
        int ceilValue = Ceil  ( arr , value) ;

        System.out.println( "Flore value of the " + value + " " + floreValue  + " \n Ciel value of the " + value + " " + ceilValue);
        findFloreCeail( arr  , value ) ;
    }
}
