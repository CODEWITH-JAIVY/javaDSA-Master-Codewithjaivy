package hashmap;

import java.text.Normalizer;
import java.util.*;

public class HashMaps {

    public  static  void myHashMap() {
        Map<String , Integer>map  = new HashMap<>() ;
     map.put(Noranmalization("Sanjeet kumar"), 24) ;
     map.put(Noranmalization("jaivy ROY ") , 25) ;
     map.put(Noranmalization("Krishana kumar ") , 23 ) ;

    // map.remove("SAnjeet kumar".toLowerCase());
      // System.out.println(map.get(Noranmalization("SANJEET  KUMAR") ) );
      // System.out.println(map.get("Sanjeet kumar".toLowerCase()));
       // map.put(Noranmalization("Sanjeet kumar") , 30 ) ;
        //System.out.println(map.get("sanjeet kumar"));
        map.putIfAbsent("Sanjeet ".toLowerCase() , 30 );
        System.out.println( map.putIfAbsent("Sanjeet ".toLowerCase() , 30 ));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
        // print all the value in the  map

        for(String key : map.keySet()) {
            System.out.println(key );
        }
//        for(Map.Entry<String , Integer>e : Map.entrySet()) {
//            System.out.println(e.getKey()  + e.getValue());
//        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println("Using var keyword ");
        for( var e : map.entrySet()  ) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
    public static  String Noranmalization (String s ) {
        return  s.trim().replace("\\s+" , " ").toLowerCase();
    }
    public static void main(String[] args) {
        myHashMap( );
    }
}
