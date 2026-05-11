public class buyandsell {

    int stockBuySell(int arr[]) {
        int maxprofit =  0   ;
        int buyprice  = arr[0] ;
        int profit  =  0 ;

        for( int i =1 ; i< arr.length  ; i++ ) {
            if( arr[i] < buyprice  ) {
                buyprice = arr[i]  ;
            }else {
                int currentprofit  = arr[i] - buyprice  ;
                if ( currentprofit> profit ){
                    profit =currentprofit ;
                }
                continue ;
            }
            maxprofit = profit + maxprofit ;
            profit =0 ;
        }
        maxprofit = profit + maxprofit ;
        return maxprofit  ;
    }

    public static void main(String[] args) {
   int []arr = {63 ,17, 59, 6, 8, 7 ,52, 50, 20} ;
        buyandsell ob = new buyandsell() ;

        int profit  =ob.stockBuySell(arr) ;
        System.out.println(profit);
    }
}
