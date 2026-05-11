import java.util.Scanner;

public class SearchRowAndcolumsWise {
    public static int TwoDArraySearchingALgo( int[][] arr ,int  target )  {
        int result = -1  ;
        int i = 0 , j= arr[0].length -1  ;
        int row = arr.length -1  ;
        int col = arr[0].length -1 ;
        while( i <= row && j>= 0 ) {
            if( arr[i][j] == target ) {
                return  arr[i][j] ;
            }else if( arr[i][j] < target ) {
                i++ ;
            }else {
                j-- ;
            }
        }
        return  -1  ;
    }
    public static void main(String[] args) {
        int [][] TwoDArray  = {  {2,4,5,7,9}, {3,5,7,10,15}, {8,9,11,15,29}, {10,12,17,20,30}, {20,22,25,30,50 }} ;
        int target  ;
        Scanner scanner = new Scanner(System.in)  ;
        target = scanner.nextInt() ;
        int result = TwoDArraySearchingALgo( TwoDArray , target )  ;
        if(result != -1) {
            System.out.println("Elemnt is found ");
        }else  {
            System.out.println("No  found ");
        }
    }
}
