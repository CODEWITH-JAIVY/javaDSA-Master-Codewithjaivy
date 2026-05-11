import com.sun.jdi.PathSearchingVirtualMachine;

public class MUSTCOUNT1INNMATRIX {

    // User function Template for Java
    public static  int rowWithMax1s(int arr[][]) {
        if (arr.length == 0) return -1;
        int indexMax = 0;
        int maxcount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int lastcol = arr[i].length - 1;
            while (lastcol >= 0) {
                if (arr[i][lastcol] == 1) {
                    count++;
                } else {
                    break;
                }
                lastcol--  ;
            }
            if (count > maxcount) {
                indexMax = i;
                maxcount = count;
            }
        }
        return indexMax;
    }

    public static void main(String[] args) {
//        int arr [][]= { {0,0,1,0 } , {1,1,0,0,} , {1,1,1,1} ,{0,1,1,0} } ;
//        [[0,1,1,1],[0,0,0,0],[1,1,1,1],[0,0,0,1],[0,1,1,1],[0,0,0,1],[0,0,0,1]]
        int arr [][] = { {0,1,1,1} ,{0,0,0,1} , {1,1,1,1} ,{0,0,1,0} ,{0,1,1,1},{0,0,0,1},{0,0,0,1}} ;
        System.out.println( "index count must 1 "+rowWithMax1s(arr));
    }
}