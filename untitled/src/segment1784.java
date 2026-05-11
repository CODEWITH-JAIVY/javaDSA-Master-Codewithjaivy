public class segment1784 {
    public boolean checkOnesSegment(String s) {
        int len  = s.length()   ;
        char  schar[] = s.toCharArray() ;

        for( int i =  1  ; i < len  -1  ; i++  ) {
            if(schar[i] == 1 && schar[i-1] == 0    ) {
                return false ;
            }
        }
        return false ;
    }
}