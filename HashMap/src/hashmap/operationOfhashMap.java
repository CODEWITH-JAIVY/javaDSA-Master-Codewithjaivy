package hashmap;

import java.util.HashMap;
import java.util.Map;

public class operationOfhashMap {
    public static void main(String[] args) {
        int [] arr  = {1,1,1,1,1,2,3,8,5,4,6,4,5,2,1,} ;
        Map<Integer, Integer> map  = new HashMap<>() ;

  // count the occurance of the numner
        for (int i =0 ; i< arr.length ; i++ ) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i] , map.getOrDefault(arr[i] ,0 )+1);
            }else {
                map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1) ;
            }
        }
        for(int i =0 ; i< map.size() ; i++ ) {
            System.out.println( map.get(i) ); // here i want to print the key with valuye
        }


    }
}