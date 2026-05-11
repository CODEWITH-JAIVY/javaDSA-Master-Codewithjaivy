public class CheakSortedOrnot {
     //3.	Write a Java program to check whether an array is sorted in ascending order.
    //  	Input: [10,13,15,67,89] → Sorted
    //Input: [11, 3, 21,89,100] → Not Sorted

    public static void CheakSortedOrnotArray (int []arr ){
        Boolean isAccending   = true  ;
        for (int i = 0; i < arr.length -1 ; i++) {
            if( arr[i] > arr[i+1 ] ) {
//                System.out.println("array is accending order ");
                isAccending = false  ;
                break;
            }
        }
        if(isAccending) {
            System.out.println("Array is  Sorted  order ");
        }else {
            System.out.println("Array is Not Sorted  order ");
        }
    }
     public static void main(String[] args) {
         System.out.println("For Array one ");
         int [] arr  =  {10,13,15,67,89 } ;
         System.out.println("For array  two ");
         int [] arr1  =  { 11, 3, 21,89,100 } ;

         CheakSortedOrnotArray(arr) ;
         CheakSortedOrnotArray( arr1 ) ;
     }
}
