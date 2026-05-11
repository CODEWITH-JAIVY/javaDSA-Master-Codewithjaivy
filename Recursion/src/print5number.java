import com.sun.security.jgss.GSSUtil;

public class print5number {
    public  static  void   print(int  n  ) {
//        if ( n ==0 ) {
//            return  ;
//        }
          System.out.println(n);
         print(n+1);
         System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }
}
