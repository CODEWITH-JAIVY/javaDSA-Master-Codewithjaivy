import java.util.Scanner;

public class SearchinRotatedArray {
    public  static int  FindPivetElement   (int [] arr )  {
         int start = 0 , end  = arr.length -1 ;
         while (start <= end ) {
             int mid  = start+ ( end  - start ) / 2 ;

             // Case 1: mid is pivot
             if (mid < end && arr[mid] > arr[mid + 1]) {
                 return mid;
             }

             // Case 2: mid-1 is pivot
             if (mid > start && arr[mid] < arr[mid - 1]) {
                 return mid - 1;
             }

             // Case 3: left side sorted, go right
             if (arr[start] <= arr[mid]) {
                 start = mid + 1;
             } else {
                 end = mid - 1;
             }
         }
         return  -1  ;
    }
    public  static int  binarySeach( int []arr , int target ,int start   ,int  end   )  {
         int result = -1  ;
        while  ( start  <= end  ) {
            int mid  = start + ( end  -start ) /2  ;
            if( arr [mid] == target ) {
                result = mid ;
                return  result  ;
            }
            else if( arr[mid] < target ) {
                start  = mid +1  ;
            }else  {
                end  = mid- 1 ;
            }
        }
        return  result ;
    }
    public static  int SearchinRotatedArrays( int []arr ,int   target )  {
        if(arr.length == 1 ) {
             if( arr[0] == target ) {
                 return  0 ;
             }
        }
         int pivotIndex = FindPivetElement   ( arr ) ;
         int result  = -1 ;
          if( pivotIndex == -1 ) {
              return  -1  ;
          } else {
            result = binarySeach( arr , target , 0 , pivotIndex  ) ;

           if(result == -1 ) {
               result = binarySeach( arr , target ,   pivotIndex  , arr.length-1  ) ;
           }else {
               return  result ;
           }
        }
         return  result  ;

    }

    public static int searchInRotated(int[] nums, int value) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if there is duplicate in the sorted arraya

            if( nums[start] == nums[mid] && nums[mid] == nums[end] ) {
                start ++ ;
                end -- ;
                continue;
            }
            if (nums[mid] == value) {
                return mid;
            }
            //chek in the  left  sorted
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= value && value < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // chek in the right sorted
            else {
                if (nums[mid] < value && value <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }
        return -1; // not found

    }
    public static void main(String[] args) {
        int [] nums = { 7,8,9,10,1,2,3,4,5,6} ;
        int value  ;
        Scanner scanner = new Scanner(System.in) ;
        value = scanner.nextInt() ;
//       int result =  SearchinRotatedArrays( nums  , value ) ;
//
        int result =   searchInRotated ( nums  , value ) ;
        if(result != -1 ) {
            System.out.println("Value is find on index " + result  );
        }else  {
            System.out.println("Value is  not foudn ");
        }


    }
}
