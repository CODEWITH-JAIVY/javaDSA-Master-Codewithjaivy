public class Main {
    public static void main(String[] args) {

        TrieInsertOperation obj = new TrieInsertOperation();

        String[] words = {
                "cat",
                "camel",
                "apple",
                "boy",
                "application",
                "app"
        };

        for (String word : words) {
            obj.insert(word);
        }

        System.out.println("Words inserted successfully.");

        String word = "app";

        if (obj.search(word)) {
            System.out.println(word + " word is found in the trie");
        } else {
            System.out.println(word + " word is not found in the trie");
        }
    }
}