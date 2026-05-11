package DSU;

public class disjointUnionSet {

    int parent [] ;
    public disjointUnionSet (int V ) {
        this.parent = new int[V] ;

        for(int i =0; i< V ; i++ ) {
            parent[i] =  i  ;    // khud ka khud hi parent ya leader bn gya
        }
    }

    public int find (int X ) {
        if(parent[X] != X ) {
            parent[X] = find(parent[X]);
        }
        return parent[X] ;
    }

    public  void  union ( int X , int Y ) {
        int px = find(X) ;
        int py = find(Y) ;

        if(py != px ) {
            parent[py] = px  ;
        }
        if ( py == px ) return;
    }

    public boolean isSet(int x , int y  , int [][]edge ) {
         for( int e[] : edge ) {
             union(e[0] , e[1]);
         }
         return  find(x) == find(y) ;
    }
    public static void main(String[] args) {
        disjointUnionSet dg  = new disjointUnionSet(7) ;
        int[][] edge = {
                {1, 2},
                {1, 3},
                {2, 3},
                {2, 4},
                {1, 4},
                {5, 6}
        };

        System.out.println(dg.isSet(2 , 6,edge));
    }
}