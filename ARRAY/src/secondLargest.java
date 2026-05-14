public class secondLargest  {
    public static  int secongLag(int [] arr  ) {
        int first  = Integer.MIN_VALUE ;
        int second  = Integer.MIN_VALUE ;

        for(int val  : arr  ) {
            if(val > first ) {
                 second  = first  ;
                 first = val  ;
            }else if  (val > second  &&  val != first  ) {
                second = val  ;
            }
        }
        return   second  ;
    }
    public static void main(String[] args) {
        int []arr  = { 1,5,3,9,7} ;
        int ans  = secongLag(arr ) ;
        System.out.println("Second  Largest number  " + ans  );
    }
}