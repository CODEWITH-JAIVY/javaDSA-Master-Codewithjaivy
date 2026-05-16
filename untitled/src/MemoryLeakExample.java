import java.util.ArrayList;
import java.util.List;


public class MemoryLeakExample {

    // Static collection
    private static List<byte[]> cache = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            // Add 1 MB objects continuously
            cache.add(new byte[1024 * 1024]);

            System.out.println("Objects stored: " + cache.size());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}