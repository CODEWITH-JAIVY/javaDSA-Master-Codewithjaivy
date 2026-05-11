package com.LinkedList;

import java.util.*;
import java.util.stream.Collectors;

public class MethodImplementation {

    public static void main(String[] args) {
//        LinkedList<Integer>list  = new LinkedList<>() ;
        List<Integer>list =new ArrayList<>() ;
list.add(10) ;
list.add(20);
list.add(50)  ;
list.add(1) ;
        Collections.sort(list);
      //  System.out.println(list);
//       list.stream()
//               .filter(x->x%2==0)
//               .forEach(System.out::println);
         LinkedList<Integer>list1 = (LinkedList<Integer>) list.stream()
               .distinct()
                 .collect(Collectors.toCollection( LinkedList :: new ) )   ;
//               .forEach(System.out::println);

        int min = list.stream().min(Comparator.naturalOrder()).orElseThrow();
       // int max = list.stream().max(Comparator.naturalOrder()).orElseThrow();

        System.out.println("Min: " + min);
    //    System.out.println("Max: " + max ) ;



//        Iterator<Integer>iterator = list.descendingIterator() ;
//        while( iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

         System.out.println(list1);
    }
}
