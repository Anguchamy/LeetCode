class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b) -> b.getValue().compareTo(a.getValue()));
        for(Map.Entry<Integer,Integer> m: map.entrySet()) {
            queue.offer(m);
        }


        int karr[] = new int[k];
        for(int i=0;i<k;i++) {
            karr[i] = queue.poll().getKey();
        }

        return karr;
    }
}