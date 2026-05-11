public class RemoveAllOccurrencesOfCharacter {

    /*
     Remove all occurrences of a character
     Input → "banana", 'a' → Output → "bnn"
    */

    public static String remove(String str, char ch) {
        // base case
        if (str.isEmpty()) {
            return "";
        }

        // recursive step: check first character
        char first = str.charAt(0);
        if (first == ch) {
            // skip this character
            return remove(str.substring(1), ch);
        } else {
            // keep this character
            return first + remove(str.substring(1), ch);
        }
    }

    public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';
        String result = remove(str, ch);
        System.out.println(result); // Output → bnn
    }
}
