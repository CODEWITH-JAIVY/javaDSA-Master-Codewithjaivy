package peakIndexInMountainArray;

class Solution {
    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0 ;
        int end  = arr.length-1 ;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // still going up, peak is to the right
                start = mid + 1;
            } else {
                // mid might be the peak, move left
                end = mid;
            }
        }

        return start; // or end, both will be the peak
    }

    public static void main(String[] args) {
        int  [] arr  = { 4,5,6,7,8,9,0,1,2} ;
        System.out.println( peakIndexInMountainArray( arr));
    }
}