package Introduction;

// ============ UNDIRECTED GRAPH =============
public class adjacenMatrixGrapgh {
int vertex ;
int matrix [][]  ;

    adjacenMatrixGrapgh(int vertex  ) {
         this.vertex = vertex ;
         matrix = new int[vertex][vertex] ;
    }

    private  void  add(int edge , int ver) {
        matrix[edge][ver] = 1;
        matrix[ver][edge] = 1  ;
    }
    private  void print (){
        for( int i =0 ; i< vertex ; i++ ) {
            for( int j=0; j<vertex ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjacenMatrixGrapgh g = new adjacenMatrixGrapgh(7) ;
        g.add(1 , 1);
        g.add( 0,1 );
        g.add(1,3);
        g.add(1,2 );
        g.add(3,1 );
        g.add(2,4 );
        g.print();

    }

}