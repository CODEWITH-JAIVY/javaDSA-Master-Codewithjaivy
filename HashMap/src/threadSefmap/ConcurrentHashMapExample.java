package threadSefmap;

import java.util.concurrent.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Thread 1 adds data
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put("T1-" + i, i);
            }
        });

        // Thread 2 adds data
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put("T2-" + i, i * 10);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Map: " + map);
    }
}

