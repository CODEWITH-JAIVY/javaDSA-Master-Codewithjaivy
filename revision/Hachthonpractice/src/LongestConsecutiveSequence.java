import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    /*
    Given an unsorted array, return the length of the longest sequence of consecutive integers.
Input: [100, 4, 200, 1, 3, 2]
Output: 4 (sequence = 1,2,3,4)
     */
public static int[] sequncy(int []arr ) {
//    int res  [] =  new int[arr.length] ;
//    Arrays.sort(arr); // 1 2,3,4,100,200
//    int k =0  ;
//    res[k++]= arr[0] ;
//    for(int i =1 ; i< arr.length ; i++ ) {
//        if(arr[i]== res[i-1]+1) {
//            res[k++] = arr[i] ;
//        }
//    }
//    return res ;
    Set<Integer>set = new HashSet<>() ;
    Arrays.sort(arr);
    int key  = arr[0];
    set.add(key) ;
    for(int i  =1 ; i< arr.length ; i++) {
        if(key+1== arr[i]) {
            key = arr[i] ;
            if(!set.contains(arr[i])) {
                set.add(arr[i]) ;
            }
        }
    }
    int size = set.size() ;
    int []res   = new int[size] ;
    int k =0;
    for( int val : set ) {
        res[k++] = val ;
    }
    return  res  ;
}
    public static void main(String[] args) {
        int [] arr  = { 100,4,200,1,3,2} ;
        int []res  = sequncy(arr) ;
        for(int val  : res ) {
            System.out.println(val);
        }
    }
}
