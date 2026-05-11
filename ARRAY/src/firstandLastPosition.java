import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

class FirstAndLastPosition {

    // Find first position (lower bound)
    public static int lowerPosition(int[] arr, int target) {
        int ans = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;       // possible answer
                end = mid - 1;   // keep searching left
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    // Find last position (upper bound)
    public static int HigerPosition(int[] arr, int target) {
        int ans = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;       // possible answer
                start = mid + 1; // keep searching right
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static  int [] SearchRange( int [] nums , int target ) {
        int last = -1 , first  = -1  ;
        int[]result = { -1 ,-1 } ;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] == target ) {
                if(last == -1 && first ==  -1 ) {
                    last = i ;
                    first = i ;
                }else {
                    last = i  ;
                }
            }
        }
        result [0] = first ;
        result [1] = last ;
        return  result ;

    }

    public  static   int  firstAndLastOccurencewithinsingleFunctionname (int [] arr , int target , boolean value  ) {
        int start  =0 , end = arr.length -1 ;
        int ans = -1   ;
        while ( start <= end ) {
            int mid = start +  ( end  - start ) / 2 ;
                 if( arr[mid] < target ) {
                     start = mid +1 ;
//                     ans   = mid ;
                 } else  if ( arr[mid] > target ) {
                     end  = mid  -1   ;
//                     ans = mid ;
                 } else  {
                     ans = mid  ;
                     if(value) {
                         end  = mid - 1 ;
                     }else  {
                         start =  mid +1 ;
                     }
                 }
        }
        return  ans ;
    }

    // Wrapper function
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = lowerPosition(nums, target);
         result[1]  = HigerPosition(nums, target);
        return result;
    }
    // wrapper function to find the tha first and last occurence within single funtion
      public  static  int  [] firstAndLastOccurence(int []  nums  ,int  target ) {
          int[] result = {-1, -1};
          result[0] = firstAndLastOccurencewithinsingleFunctionname (nums, target , true);
          result[1] =firstAndLastOccurencewithinsingleFunctionname (nums, target , false  );
          return result;
      }


    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the target:");
        int target = scanner.nextInt();


        System.out.println("This approach is for the log(n) time complexity , 1st method ");
        int[] result = searchRange(nums, target);
        System.out.println("First position: " + result[0]);
        System.out.println("Last position: " + result[1]);


        System.out.println("This approach is brush force aproach  , second method ");
        int []  result1 =  SearchRange( nums , target ) ;
        System.out.println("First position: " + result1[0]);
        System.out.println("Last position: " + result1[1]);

        // find the first and last occurance in the array while  calling a single method
        // and just  find the first and last occurance
        System.out.println("This approach is Highely optimisze with in time complexity ( log n )  , 3rd Appraoch ");
        int []result2 = firstAndLastOccurence( nums  , target ) ;
        System.out.println("First position: " + result2[0]);
        System.out.println("Last position: " + result2 [1]);
    }
}
