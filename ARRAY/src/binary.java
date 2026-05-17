public class binary {
    public static boolean bin( int []  arr ,int  n   )  {
        int start =    0 ;
        int end = arr.length ;
        while(start< end ) {
//            int mid  =  start+ end  / 2  ;
            int mid  = start+(end - start) / 2 ;


        }

        return  true ;
    }
    public static void main(String[] args) {
        int []arr = { 1,2,3,4,5,6} ;
          boolean ans  =  bin(arr , 4 ) ;
        System.out.println(ans );
    }
}