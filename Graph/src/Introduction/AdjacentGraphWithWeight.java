package Introduction;

// Weighted undirected graph using adjacency matrix
public class AdjacentGraphWithWeight {

    private int vertex;
    private int[][] matrix;

    public AdjacentGraphWithWeight(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    // Add edge with weight
    public void add(int u, int v, int weight) {
        matrix[u][v] = weight;
        matrix[v][u] = weight; // undirected graph
    }

    public void print() {
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        AdjacentGraphWithWeight g = new AdjacentGraphWithWeight(3);

        // A(0), B(1), C(2)
        g.add(0, 1, 10); // A - B
        g.add(0, 2, 20); // A - C
        g.add(1, 2, 30); // B - C

        g.print();
    }
}