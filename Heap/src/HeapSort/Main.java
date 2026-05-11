package HeapSort;

import static HeapSort.Accendingorder.Assending;

public class Main {

    public static void main(String[] args) {
        int [] arr  = { 1,2,34,56,7,8,10 } ;
        Assending(arr  ) ;
        for( int  val : arr ) {
            System.out.print(val+" " );
        }
    }
}