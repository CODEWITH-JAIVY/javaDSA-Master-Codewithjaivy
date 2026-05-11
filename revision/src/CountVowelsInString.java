 public class CountVowelsInString {

//    static int count = 0  ;
    public static  int Count( String name ) {
        if (name.isEmpty()) {
            return 0;
        }

        char ch = Character.toLowerCase(name.charAt(0));

        int count = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;

        return count + Count(name.substring(1));

    }
    public static void main(String[] args) {
        String name  = "sanjeet kumar " ;
        int number = Count (name) ;
        System.out.println(number);
    }
}
