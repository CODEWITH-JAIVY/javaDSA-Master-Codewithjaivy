import java.util.Arrays;

public class mergeInterval56 {

    public void  merge(int[][] intervals) {

       for(int i =0  ; i<intervals.length ; i++ ) {
            Arrays.sort(intervals[i]);
       }
        for (int[] row : intervals) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int [][] intervals =  { {1,2,3,4} ,{4,5,6,10,6},{1,2,3}} ;
        mergeInterval56 obj = new mergeInterval56() ;
        obj.merge(intervals);
    }
}
