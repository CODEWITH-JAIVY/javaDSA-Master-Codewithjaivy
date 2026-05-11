package serachInRotatedArray;

public class Solution {
public static int search ( int [] arr , int target ) {
   int start =  0 ;;
   int end  = arr.length -1  ;

   while ( start <= end ) {
       int mid = start +  ( end - start ) /2  ;
       if(arr[mid] == target )  return   mid  ;
       // left half in sorted
       if( arr[start] <= arr[mid]){
            if(arr[start] <= target && target  < arr[mid]) {
                end = mid -1  ;
            }else  {
                start = mid +1  ;
            }
       }else  { // right unknow
           if(arr[mid] > target && target <= target ){
               start = mid + 1  ;
           }else  {
               end = mid -1 ;
           }
       }

   }
    return  -1   ;
}
    public static void main(String[] args) {
        int [] arr = {1 , 3 } ;
        System.out.println(search(arr , 3 ));
    }
}