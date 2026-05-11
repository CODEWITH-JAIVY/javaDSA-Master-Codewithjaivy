public class LargestElement {
    //1.	Write a Java Program to find the Largest element in an Array. Input: [1, 8, 3, 6, 7]
    // Output: 8
    public static  int LargestElementvalue (int [] arr ) {
        int max  = 0  ;
        for (int i = 0; i < arr.length ; i++) {
            if( arr[i] > max ) {
                max = arr[i] ;
            }
        }
        return  max  ;
    }
    public static void main(String[] args) {
        int [] arr  =  {  1,8,3,6,7 } ;
        int result = LargestElementvalue ( arr ) ;
        System.out.println("The largest value is " + result  );
    }
}
