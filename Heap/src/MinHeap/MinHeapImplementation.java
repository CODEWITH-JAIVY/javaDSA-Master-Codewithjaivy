package MinHeap;

public class MinHeapImplementation {
    static class  heap {
        int key ;
        int size  ;
        int capacity  ;
        int []minheap  ;
        heap(int capacity) {
            this.capacity = capacity ;
             size =0  ;
             minheap = new int[capacity] ;
        }
        public void insert( int key ) {
            if( size == capacity) {
                System.out.println("Heap is full ");
                return;
            }
            int i  = size  ;
            minheap[i] = key ;
            size ++ ;
            while (i!=0  && minheap[i] < minheap[(i-1)/ 2 ]) {
                swap(  i  , (i-1) /2 ) ;
                i  = (i-1)/2  ;
            }
        }
        public void swap( int i , int j  ) {
            int tem  = minheap[i] ;
            minheap[i] = minheap[j] ;
            minheap[j] = tem ;
        }
        public  int getmin ( ) {
            return minheap[0] ;
        }



        // delete from the min Heap
         public void delete() {
            int min  = minheap[0] ;
            minheap[0]= minheap[size -1] ;
            size -- ;
            int i  = 0 ;

            while (true) {
                int minIndex  = i ;
                int left = 2 * i +1  ;
                int right = 2 * i +2  ;

                if( left < size && minheap[left]  <  minheap[minIndex]) minIndex = left  ;
                if( right < size && minheap[right] <  minheap[minIndex])minIndex = right ;

                if( minIndex != i  ) {
                    swap(minIndex , i );
                    i  = minIndex ;
                }else {
                    break;
                }
            }

         }

    }

    public static void main(String[] args) {
        heap heapobject  = new heap(10) ;
        heapobject.insert(10);
        heapobject.insert(30);
        heapobject.insert(5);
        heapobject.insert(100);

        int key  = heapobject.getmin();
        System.out.println(key);
//        heapobject.insert(100);
        heapobject.delete();

        int min = heapobject.getmin() ;
        System.out.println(" min element is "+min);


    }
}