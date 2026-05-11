package maxAreawatercontainer;

class  Solution {
    public static  int maxArea(int[] h) {

            int maxarea =0 ;

            int start  = 0 ;
            int  end  = h.length -1  ;
            while( start  < end ) {
                int len  = end - start  ;
                int with  = Math.min( h[start] , h[end]) ;
                int area  = len * end  ;
                if( maxarea< area ) {
                    maxarea  = area  ;
                }
            }
            return maxarea  ;
        }

    public static void main(String[] args) {
        int [] height = {1, 1  } ;
        int res  = maxArea(height);
        System.out.println(res);
    }
}