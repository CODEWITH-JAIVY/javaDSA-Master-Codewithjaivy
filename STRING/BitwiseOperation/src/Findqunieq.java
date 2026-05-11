public class Findqunieq {
    public static void main(String[] args) {
        int []arr  = { 1,1,1,1,2,2,1,2,1} ;
        int n  = arr[0 ]  ;
        for( int  i  = 1 ; i< arr.length  ; i++ ) {
             n  = n^arr[i] ;
        }
        System.out.println(n);
    }
}