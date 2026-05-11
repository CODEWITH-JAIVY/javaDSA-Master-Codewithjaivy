//import java.util.ArrayList;
//
//public int findMinDiff(ArrayList<Integer> arr, int m) {
//    if( arr.size()==0  ) {
//        return 0 ;
//    }
//    if( arr.size() < m ) {
//        return 0 ;
//    }
//
//    int midDiff = Integer.MAX_VALUE ;
//    Collections.sort(arr)         ;
//    for( int i = 0 ; i < arr.size() -m +1 ; i++ ) {
//        int min = arr.get(i) ;
//        int max = arr.get(i+m-1);
//        midDiff = Math.min(  midDiff , max - min ) ;
//    }
//
//    return midDiff ;
//}
//
//
//void main() {
//}