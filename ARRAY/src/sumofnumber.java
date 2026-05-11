public class sumofnumber {
    public  static  void sum(int num ) {
        int ans  = 0  ;
        while (num > 0 ) {
            int rem = num % 10  ;
            ans   = rem + ans ;
            num = num / 10 ;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        sum(123);

    }
}