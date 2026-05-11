public class PeakElement {
    public static int SolusitonPickElement( int []arr )  {
        int start  =  0 , end = arr.length -1  ;
        while (start <= end ) {
            int mid  = start + ( end -start ) / 2  ;
            if(arr[mid]  > arr[mid-1]  && arr[mid] > arr[mid+1]) {
                return  mid ;
            }else if  (arr[mid] < arr[mid+1] && arr[mid] > arr[mid-1]) {
                start = mid +1 ;
            }else  {
                end  = mid -1  ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        int []arr = { 5, 6, 7 ,8,9,10, 3 , 2 ,1  ,0  } ;
        int peakElement = SolusitonPickElement( arr ) ;
        if(peakElement != -1) {
            System.out.println(peakElement);
            System.out.println("Peak Element is " +arr[ peakElement] );
        }else {
            System.out.println("Peak Element is not found ");
        }

    }
}
