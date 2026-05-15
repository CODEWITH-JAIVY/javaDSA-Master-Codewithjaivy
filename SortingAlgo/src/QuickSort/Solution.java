package QuickSort;

public class Solution {
    public static void quickSort(int []arr,int  start , int end  ) {
        if(start >=end  ) {
            return  ;
        }
        int pivot  = partition(arr , start , end  ) ;
        quickSort(arr , start , pivot-1  ) ;
        quickSort(arr , pivot+1 , end  ) ;
    }
    public static int partition(int arr[] , int start , int end ) {
        int randomIndex = start + (int)(Math.random() * (end - start + 1));

        swap(arr, randomIndex, end);
        int pivot = arr[end];
        int pi  = start  ;
        for(int i = start  ; i< end  ; i++ ) {
            if(arr[i] <  pivot ) {
                swap(arr , i , pi ) ;
                pi++ ;
            }
        }
        swap(arr , pi , end ) ;
        return pi  ;
    }
    public static void swap(int arr[] , int start , int end ) {
        int temp = arr[start] ;
        arr[start ] = arr[end ] ;
        arr[end] = temp  ;
    }
    public static  int[] sortArray(int[] nums) {
        int start  = 0  ;
        int end  = nums.length -1  ;
        quickSort(nums , start , end  ) ;
        return nums ;
    }

    public static void main(String[] args) {
        int [] arr ={1,0,2,3,5,6,8,9,4} ;

         int [] ans  = sortArray(arr) ;
        for( int val  : ans ) {
            System.out.print(val + " ");
        }
    }
}