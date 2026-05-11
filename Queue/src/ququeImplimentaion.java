import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ququeImplimentaion {

    public static void  removeing(Queue<Integer>queue)  {
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>() ;
        queue.add(10) ;
        queue.add(30) ;
        queue.add(40) ;
        queue.add(50) ;
        removeing(queue) ;
//        System.out.println(queue.remove());
//        System.out.println(queue.poll() );
//        System.out.println(queue.remove());
        System.out.println(queue.element());
//        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
