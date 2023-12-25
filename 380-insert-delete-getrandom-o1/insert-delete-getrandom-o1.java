class RandomizedSet {
    HashSet<Integer> randomizedSet;
    public RandomizedSet() {
        randomizedSet = new HashSet();
    }
    
    public boolean insert(int val) {
        return randomizedSet.add(val);
    }
    
    public boolean remove(int val) {
        return randomizedSet.remove(val);
    }
    
    public int getRandom() {
        return randomizedSet.stream().skip(new Random().nextInt(randomizedSet.size())).findFirst().orElse(null);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */