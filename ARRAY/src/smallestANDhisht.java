import java.util.*;

public class smallestANDhisht {

    public static  List <int []>  Solution ( int [] arr , int target  )  {
       int start  = 0 , end  = arr.length-1  ;
//       List<[]int>result = new  ArrayList<>();
        List<int[]> result = new ArrayList<>();
       while (start  < end  ) {
           int sum  = arr[start] + arr[end] ;
           if( sum  == target ) {
               result.add(new int [] {arr[start] , arr[end]}) ;
               start ++ ;
               end -- ;
           }
            else if( sum > target ) {
               end-- ;
           }else {
                start++;
           }
       }
       return  result ;
    }

    public static void main(String[] args) {
        int [] arr =  { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 } ;
        int target ;
        Scanner scanner = new Scanner(System.in) ;
        target = scanner.nextInt() ;
        List<int[]>result  = Solution (arr , target  ) ;
        System.out.println("Working ");
        if( result.isEmpty()) {
            System.out.println("No distinct pair is  found ");
        }else {
            for( int [] p : result ) {
                System.out.println( p[0] + " " + p[1]);
            }
        }

    }
}
