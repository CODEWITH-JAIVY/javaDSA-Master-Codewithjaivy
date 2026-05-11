public class majority169 {
    public  static  int Majority(int [] arr ) {
        int count  = 0 , condidate  = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            if (count == 0) {
             condidate = arr[i];
            }
         count += (condidate==arr[i])?1 : -1 ;
        }
        return  count ;
    }
    public static void main(String[] args) {
        int [] arr = { 1,1,1,1,2,2,0,0,5,5,1,1 , 1} ;
        int k  = Majority(arr) ;
        System.out.println("Majority Element is " +  k );
    }
}
