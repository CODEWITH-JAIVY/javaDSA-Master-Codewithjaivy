import java.util.*;

public class vector {
    public static void main(String[] args) {
        Vector<Integer>vector = new Vector<>() ;

        ArrayList<Integer> list  = new ArrayList<>()  ;
        int num  =  0  ;
        List<Integer>list1   = new ArrayList<>() ;
        ArrayList<Integer> list3  = new ArrayList<>()  ;

//        Queue<Integer> q  = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> q  = new PriorityQueue<>(( a ,  b  )->  b -a     );
        q.add(10) ;
        q.add(20) ;
        q.add(30) ;
        q.add(40) ;
        q.add(80) ;

        System.out.println(q.poll());
    }
}