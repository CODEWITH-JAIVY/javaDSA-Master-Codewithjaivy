package SecondLargest;

import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

public class Solution {
///     Find second largest element  without soring

 public  static  int secondHigh (int [] arr  ) {
     PriorityQueue<Integer>priorityQueue  = new PriorityQueue<>(
             (a ,b )-> a -b
     ) ;
     for(int val  : arr ) {
       priorityQueue.add(val) ;
       if(priorityQueue.size() > 2  ) {
           priorityQueue.remove() ;
       }
     }
     return priorityQueue.peek();
 }
public static void main(String[] args) {
    int [] arr  = { 1,2,7,8,9, 3,4 } ;
    int ans  = secondHigh(arr) ;
    System.out.println("Second Largest Number " + ans  );


}
}