public class OperationOnArray {
   public static  void  insertingAtstart( int arr[] , int x ) {
       int size  = 0  ;
       for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 ) {
                size++ ;
            }
       }
       for (int i = size ; i >0  ; i-- ) {
           arr[i] = arr[i-1 ] ;
       }
       arr[0] = x ;
       size++ ;
//       display(arr , size );
   }
   public  static  void insertingAtend( int arr[]  , int x ) {
       int size  = 0  ;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] != 0 ) {
               size++ ;
           }
       }

       arr[size] = x  ;
       size++ ;
//       System.out.println( "The value "+ x  + " inseterted  at the end of arry ");
//       display(arr , size );

   }

   public  static   void  inseringAtSpecificPostion ( int arr[]  , int pos , int value ) {
       int size = 0  ;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] != 0 ) {
               size ++  ;
           }
       }
       if( pos > size  ||  pos < 0 ) {
           System.out.println("Invalid position ");
            return;
       }
       for (int i = size ; i >  pos -1 ;  i-- ) {
           arr[i] = arr[i-1 ] ;
       }
       arr[pos-1 ] = value  ;
       size++ ;
//       display(arr ,size );
   }

   // deletion at the starting of the array
   public static  void deleteAtstart (int arr[]  ) {
       int size = 0;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] != 0) size++;
       }
       for (int i =  0 ; i <size  ; i ++  ) {
           arr[i] = arr[i+1 ] ;
       }
       size--   ;

       display(arr , size );
   }

   // delete at the end of the array
    public  static  void deleteAtsend( int arr[]  ) {
       int size =  0 ;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] !=  0 ) size++ ;
        }
        arr[size-1] = 0  ;
        size--  ;
        display(arr , size );
    }
    // delete element at the specific postion
    public  static  void deleteAtTheSpecificPsotion( int arr[] ,  int pos ) {
       int size =0  ;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] !=  0 ) {
                size++ ;
            }else {
                break;
            }
        }
        try{
            if(pos> size || pos<= 0 ) {
                throw new Exception("Delet only from the less then the size " +  size + " and greteer than the 0 ") ;
            } else  {
                for( int i = pos-1 ; i < size-1  ; i++ ) {
                    arr[i] = arr[i+1] ;
                }
            }
            size-- ;
            display(arr , size  );
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
    }
   public static  void display( int arr[]  , int size  ) {
//       int size  = 0  ;
//       for (int i = 0; i < arr.length; i++) {
//           if(arr[i] != 0 ) {
//               size++ ;
//           }
//       }
//       System.out.println(size );
       for (int i = 0; i < size ; i++) {
           System.out.print(arr[i] + " ");
       }
   }
    public static void main(String[] args) {
        int [] arr  = new int[10] ;
        arr[0]=1 ;
        arr[1] = 2  ;
        arr[2] =3  ;
        arr [3] = 4  ;

        // inserting the element in the array at the end
        insertingAtstart( arr , 5 ) ;
//        display(arr);

        insertingAtend( arr , 10 ) ;

        inseringAtSpecificPostion( arr ,  3 ,  100 ) ;
         deleteAtstart( arr ) ;

        deleteAtsend ( arr  );

        deleteAtTheSpecificPsotion ( arr , 8 );
    }
}
