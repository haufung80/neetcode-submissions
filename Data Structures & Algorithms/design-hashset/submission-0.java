class MyHashSet {
    private Map<Integer, Boolean> store;
    public MyHashSet() {
        store = new HashMap<>();
    }
    
    public void add(int key) {
        if (!store.getOrDefault(key, false)) {
            store.put(key, true);
        }
    }
    
    public void remove(int key) {
        store.remove(key);
    }
    
    public boolean contains(int key) {
        return store.getOrDefault(key, false);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */