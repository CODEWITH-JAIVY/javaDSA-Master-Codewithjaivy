public class Palindromecheak {
    public static void main(String[] args) {
        //5.	Write a Java program to check if an array is palindromic (i.e., it reads the same forward and backward).
        //Input: [1, 2, 3, 2, 1]
        //Output: Yes
        int []arr = { 1,2,3,2,1 , 6 } ;
        int  start = 0  ;
        int end  = arr.length-1  ;

        while (start <= end ) {
            if(arr[start] != arr[end] ) {
                System.out.println("Not palindrom ");
                return;
            }
            start ++ ;
            end --   ;
        }
        System.out.println("Array is palindrom ");

    }
}
