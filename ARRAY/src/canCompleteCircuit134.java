public class canCompleteCircuit134  {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas   = 0 ;
        int totalCust = 0 ;

        for(int val : gas ) {
            totalGas += val  ;
        }
        for(int val : cost ) {
            totalCust += val  ;
        }
        if(totalGas < totalCust ) return -1 ;

        int start  =0 ;
        int currentGas  = 0 ;
        for(int i =0  ; i<gas.length  ; i++ ) {
            currentGas  += gas[i] - cost [i] ;
            if(currentGas < 0 ) {
                start  = i +1 ;
                currentGas = 0  ;
            }
        }
        return start   ;
    }

    public static void main(String[] args) {
        int [] cost =  {1,2,3,4,5  } ;
        int [] gas = {3,4,5,1,2  } ;
         int ans  = canCompleteCircuit(cost ,gas ) ;
        System.out.println("Startgin Index Journy + " +  ans );
    }
}