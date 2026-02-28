import java.util.*;

class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void putValue(int key, int value) {
        super.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.putValue(1, 10);
        cache.putValue(2, 20);
        System.out.println(cache.get(1)); // 10

        cache.putValue(3, 30); // removes key 2
        System.out.println(cache.get(2)); // -1
    }
}
