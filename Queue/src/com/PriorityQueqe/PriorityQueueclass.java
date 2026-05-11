package com.PriorityQueqe;

import javax.security.auth.kerberos.KerberosTicket;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueclass {
    public static int kthLargest(PriorityQueue<Integer>pq ,  int  k   ) {
        if(k > pq.size() ) return  0 ;

        while (true) {
            if (pq.size() > k) {
              pq.remove() ;
            }
            if(pq.size() == k ) break;
        }
        return pq.peek() ;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer>  pq  = new PriorityQueue() ;
        pq.add(10) ;
        pq.add(100) ;
        pq.add(18) ;
        pq.add(13) ;
        pq.add(18) ;
        pq.add(20) ;
//        while( ! pq.isEmpty()) {
//            System.out.print (pq.poll() + " ");
//        }
        int kth  = kthLargest(pq ,  7) ;
        if(kth != 0 ) {
            System.out.println( " kth elemetne is "+ kth);
        }else{
            System.out.println("Enter valid kth  elemtn less than tha  " + pq.size() );
        }

        while( ! pq.isEmpty()) {
            System.out.print (pq.poll() + " ");
        }
    }
}