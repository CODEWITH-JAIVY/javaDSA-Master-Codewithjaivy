import java.util.Arrays;
import java.util.Scanner;

public class TwodiamentionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int [][]arr =new int[3][] ;


        for (int i = 0; i < 3 ; i++) {
            System.out.println( " enter the  columa size of respective row " +  i ) ;
            int col ;
            col  =scanner.nextInt() ;
            arr[i] = new int[col] ;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt() ;
            }
        }
        System.out.println("Two diamentional array ");
        System.out.println(Arrays.deepToString(arr)); // this line will be print the two diamentional array
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length ; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("  ");
//        }

        for (int []ele : arr ) {
            for( int i  : ele ) {
                System.out.print( i + " ");
            }
            System.out.println(" ");
        }
    }
}
