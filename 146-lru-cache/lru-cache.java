class LRUCache {
    HashMap<Integer, Integer> map;
    int capacity;
    LinkedList<Integer> lruCache;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        lruCache = new LinkedList<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            lruCache.remove(new Integer(key));
            lruCache.add(key);
            return map.get(key);
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            map.put(key, value);
            lruCache.remove(new Integer(key));
            lruCache.add(key);
        } else {
            if(map.size() == capacity) {
                map.remove(lruCache.poll());
            }
            map.put(key, value);
            lruCache.add(key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */