public class ReverseNumberUsingRecursion {
  public static int reverce  (int num )  {
      // base condision
      if (num == 0  ) { return 1 ;  }
      int rem = num   % 10 ;
      int rest  = num / 10 ;

       return rem*10 + reverce(rest) ;
  }
    public static void main(String[] args) {
        int res  = reverce  ( 123456) ;
        System.out.println(res );
    }
}
