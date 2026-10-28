class MyHashMap {
    private int[] valueMap = new int[1000001];
    public MyHashMap() {
        Arrays.fill(valueMap, -1);
    }
    
    public void put(int key, int value) {
        valueMap[key] = value;
    }
    
    public int get(int key) {
        return valueMap[key];
    }
    
    public void remove(int key) {
        valueMap[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */