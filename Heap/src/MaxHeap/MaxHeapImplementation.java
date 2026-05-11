package MaxHeap;

public class MaxHeapImplementation {
    static class heap {
        int kay  ;
        int size  ;
        int capacity  ;
        int []heap ;
        heap ( int capacity ) {
            this.capacity = capacity ;
            this.heap= new int[capacity] ;
            size = 0  ;
        }


        public void swap( int i , int j  ) {
            int temp = heap[i] ;
            heap[i] = heap[j] ;
            heap[j] = temp ;
        }
        public  void insert(int key  ) {
            if( size == heap.length ) {
                System.out.println("Heap is full ");
                return;
            }
            int i  =size ;
            heap[i] = key  ;
            System.out.println(key );
            size  ++ ;
            // hipify function
            while( i != 0  && heap[i] > heap[(i-1 )/2 ]) {
                swap( i , (i-1) / 2 ) ;
                i  = (i-1) / 2  ;
            }
        }
        public  int getMax () {
            return heap[0] ;

        }

        // delte max element from the heap

        public  void   delete()  {

            int Deletedmax  = heap[0] ;
            heap[0] = heap[size-1] ;
            int i  =0 ;
            size -- ;
            while( true ) {
                int maxIndex  = i ;
                int left  = i*2+1 ;
                int right  =  i * 2 +2 ;
                if( left  < size  && heap[maxIndex] < heap[left]) maxIndex = left ;
                if(right < size  && heap[maxIndex]  < heap[right]) maxIndex = right ;

                if( i != maxIndex ) {
                    swap(maxIndex , i  );
                    i  = maxIndex ;
                }else {
                    break;
                }
            }
            System.out.println("delete elemnent is  " +  Deletedmax );
        }
          public  void display () {
              System.out.println(size);
            for( int  i  =0  ;i < size ; i++  ) {
                System.out.print(heap[i] + " " );
            }
          }

    }

    public static void main(String[] args) {
        heap heapobject  = new heap(50) ;
        heapobject.insert(20);
        heapobject.insert(30);
        heapobject.insert(50);
         int max = heapobject.getMax() ;
        System.out.println("Max Element is  " +  max );

        heapobject.delete() ;
        int max1 = heapobject.getMax() ;
        System.out.println("Max Element is  " +  max1 );
        heapobject.display();
    }

}