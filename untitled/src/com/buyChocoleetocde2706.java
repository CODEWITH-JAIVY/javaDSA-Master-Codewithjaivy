package com;

import java.util.Arrays;

public class buyChocoleetocde2706 {
    public int buyChoco(int[] prices, int money) {

        int MaxSum  = 0  ;
        Arrays.sort(prices) ;
        for( int  i  = 0 ; i<  prices.length - 2   ; i ++ ) {
            int Fprice  = prices[i] ;
            int Sprice  = prices[i+1] ;
            int Tprice  = Fprice + Sprice ;
            if(Tprice > money  )  {
                return money  ;
            }else {
                if( (Fprice + Sprice) < money  ) {
                    MaxSum = Fprice + Sprice  ;
                    break;
                }
            }

        }
        return MaxSum  ;

    }
}
