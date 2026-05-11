package HashmapImplementaion;

import java.util.LinkedList;

public class Hashmapimplement {

    static class Hashmap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOADFACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of entries
        private LinkedList<Node>[] buckets;

        // Constructor
        public Hashmap() {
            initBucket(DEFAULT_CAPACITY);
        }

        private void initBucket(int n) {
            buckets = new LinkedList[n];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int searchBucket(K key, LinkedList<Node> currentBucket) {
            for (int i = 0; i < currentBucket.size(); i++) {
                if (currentBucket.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public V get(K key) {
            int index = hashFunction(key);
            LinkedList<Node> curr = buckets[index];

            int entryIndex = searchBucket(key, curr);
            if (entryIndex != -1) {
                Node node = curr.get(entryIndex);
                return node.value;
            }
            return null;
        }

        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            LinkedList<Node> currentBucket = buckets[bucketIndex];
            int entryIndex = searchBucket(key, currentBucket);

            if (entryIndex == -1) { // insert new
                Node node = new Node(key, value);
                currentBucket.add(node);
                n++;
            } else { // update existing
                Node currentNode = currentBucket.get(entryIndex);
                currentNode.value = value;
            }
        }

        public V remove(K key) {
            int index = hashFunction(key);
            LinkedList<Node> currentBucket = buckets[index];
            int entryIndex = searchBucket(key, currentBucket);

            if (entryIndex != -1) {
                Node currentNode = currentBucket.remove(entryIndex);
                n--;
                return currentNode.value;
            }
            return null;
        }

        public int size() {
            return n;
        }
    }

    public static void main(String[] args) {
        Hashmap<String, Integer> map = new Hashmap<>();

        map.put("India", 140);
        map.put("China", 130);
        map.put("US", 50);

        System.out.println("India -> " + map.get("India"));
        System.out.println("China -> " + map.get("China"));
        System.out.println("Size: " + map.size());

        map.remove("China");
        System.out.println("After removing China, size: " + map.size());
    }
}
