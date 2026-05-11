public class ReverseString {
    public static  String  Reverse( String st ) {
       if( st . length() <= 1 ) {
           return st  ;
       }
       return  Reverse(st.substring(1)) + st.charAt(0) ;
      /*  ///   String is muteable when you do substring that time in the heap block
       another Substring will create , it does'not effect  the original String

     so that reverse the string using the substring is not effective because on the every recursive
     it  create new String


       */

    }

    public static   void reverse (char [] st  , int left , int right  ) {
        if( left <= right ) {
            return;
        }
         char ch  = st[left] ;
        st[left] = st[right] ;
        st[right] = ch  ;

        reverse(st , left ++ , right --  );
    }
    public static void ReverseString( String st  ) {
        reverse(st.toCharArray() ,0 , st.length()-1);
    }

    public static void main(String[] args) {
         String  res  = Reverse("HELLO") ;
        System.out.println(res);
        System.out.println(res.substring(1));
        System.out.println(res.length());
         String st1 = "Sanjeet " ;
          ReverseString(st1);
        System.out.println(st1);
    }
}