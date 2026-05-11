package mergeKLists23;
import java.util.PriorityQueue;

 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode>minheap = new PriorityQueue<>(
                (a , b ) -> a.val - b.val
        ) ;

     for( ListNode head : lists ) {
         if(head!= null ) {
             minheap.offer(head) ;   // head of every node
         }
     }
        ListNode dummy  = new ListNode (-1) ;
        ListNode  curr = dummy ;

        while (!minheap.isEmpty()) {
            ListNode smallest  = minheap.poll() ;
            curr.next = smallest  ;
            curr = curr.next ;

            if(smallest.next != null ) {
                minheap.offer(smallest.next) ;
            }
        }
        return dummy.next ;
    }
}