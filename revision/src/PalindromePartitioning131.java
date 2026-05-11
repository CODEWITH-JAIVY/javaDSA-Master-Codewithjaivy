import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131 {
    public static boolean isPalindrom( String s ,int  start , int end  ) {
        while( start <= end ) {
            if(s.charAt(start++) != s.charAt(end--)) {
                return  false  ;
            }
        }
        return true  ;
    }
  public static void Backtracking(String  s , int start , List<List<String>> ans  , List<String>com ) {
      if(start == s.length()) {
          ans.add(new ArrayList<>(com)) ;
          return;
      }
      for (int i = start; i <s.length() ; i++) {

          if( isPalindrom( s , start , i )) {
              com.add(s.substring(start , i+1 )) ; // chouse the palindrom
              Backtracking(s , i+1 , ans , com ); // neext expolre
              com.remove(com.size()-1) ; // backtracking

          }
      }
  }
    public static  List<List<String>> partition(String s) {
   List<List<String>> ans  = new ArrayList<>() ;
   List<String>com = new ArrayList<>() ;
     Backtracking( s , 0 , ans , com ) ;
    return  ans ;

    }

    public static void main(String[] args) {
        String str = "aab" ;
        List<List<String>> ans    =  partition(str) ;
        System.out.println(ans);
    }
}