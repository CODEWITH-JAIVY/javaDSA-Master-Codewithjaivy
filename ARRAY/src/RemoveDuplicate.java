public class RemoveDuplicate {

    public static void main(String[] args) {
        String s = "programming";
        String res  =  " " ;


        for( char c  : s.toCharArray()) {
            if( ! res.contains(String.valueOf(c)))  {
                res += c  ;
            }
        }
        System.out.println(res);
    }
}