import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Square {
    //3.	Write a Java Program to find the Square of Each Element and Sort the Array
    //Input: [-4, -1, 0, 3, 10]
    //Output: [0, 1, 9, 16, 100]
    public  static  int []  SquareArray( int []arr ) {
        List<Integer>result = new ArrayList<>();
        int [] sortedArray = new int[arr.length] ;
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i] * arr[i]) ;
        }

        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            sortedArray[i] = result.get(i) ;
        }
        return  sortedArray ;
    }

    public static void main(String[] args) {
        int [] arr = {-4, -1, 0, 3, 10 }  ;
       int [] result = SquareArray( arr ) ;
       for (int ans  : result ) {
           System.out.print(ans + " ");
       }
    }
}
