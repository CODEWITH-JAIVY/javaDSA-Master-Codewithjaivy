import java.util.Scanner;

public class seachInTwoDArray {
    public static int SearchingAlgo(int [][]arr ,int  target ) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr[i].length-1; j++) {
                if(arr[i][j] == target ) {
                    return  arr[i][j] ;
                }
            }

        }
        return  -1  ;
    }
    public static void main(String[] args) {
        int [][]arr = { { 1,2,3} , {3,4,5} , {6,7,8,9} ,{2,5,6} ,{10,11,12} } ;
        int target ;
        Scanner scanner =  new Scanner(System.in) ;
        target = scanner.nextInt() ;
        int result = SearchingAlgo(arr , target ) ;
        if(result != -1 ) {
            System.out.println(result + "  is found ");
        }else  {
            System.out.println("Not found ");
        }
    }
}
