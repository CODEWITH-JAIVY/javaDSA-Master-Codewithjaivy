package DisjoinntSetUnion;

public class DisjointUnion {

    int parent[];
    int rank[];

    public DisjointUnion(int n) {
        this.parent = new int[n];
        this.rank = new int[n];
        ///  SELF PARENT
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int num) {

        if (parent[num] != num) {
            parent[num] = find(parent[num]);
        }
        return parent[num];
    }

    public void union(int x, int y) {
        int px = find(x);
        int py = find(y);


        if (px == py) return;

        if (rank[px] > rank[py]) {
            parent[py] = px;
        } else if (rank[px] < rank[py]) {
            parent[px] = py;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }

    public boolean isSet(int num1, int num2, int[][] edge) {
        // make union of the all element

        for (int[] e : edge) {
            union(e[0], e[1]);
        }

        return find(num1) == find(num2);
    }

    public static void main(String[] args) {

        int[][] edge = {
                {1, 2},
                {1, 3},
                {2, 3},
                {2, 4},
                {1, 4},
                {5, 6}
        };
        DisjointUnion dsj = new DisjointUnion(7);
        System.out.println(dsj.isSet(3, 6, edge));
    }
}