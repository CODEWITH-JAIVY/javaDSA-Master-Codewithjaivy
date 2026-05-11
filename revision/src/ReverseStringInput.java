import java.util.SplittableRandom;

public class ReverseStringInput {
    /*
    Reverse a string
    Input → "hello" → Output → "olleh"
     */
    public  static  StringBuilder res  = new StringBuilder() ;
    public static String Reverse( String str ) {
        if (str.isEmpty()) {
            return str;
        }
        // recursive case: take substring from 1st index and add first char at the end
        return Reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String st = "hello ";
        System.out.println(Reverse(st) );

    }
}
