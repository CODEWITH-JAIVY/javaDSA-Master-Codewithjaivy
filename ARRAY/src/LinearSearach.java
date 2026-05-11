import java.util.Scanner;

public class LinearSearach {

    public  static  boolean LinearSearachs( int arr[] , int x ) {
        boolean falg  = false ;
        for (int i = 0; i < arr.length; i++) {

           if( arr[i] == x ) {
               falg = true ;
           }
        }
        return  falg  ;
    }

    public static void main(String[] args) {

        int []arr  = { 1,2,10, 3,4,5,6} ;
        int value  ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the value to be searched ");
        value = scanner.nextInt()  ;
         boolean result = LinearSearachs(arr , value  ) ;
         if(result) {
             System.out.println("Element is found ");
         }else {
             System.out.println("Element is not found ");
         }
    }
}
