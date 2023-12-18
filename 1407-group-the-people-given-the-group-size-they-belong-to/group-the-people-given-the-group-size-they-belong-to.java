class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++) {
            if(map.containsKey(groupSizes[i])) {
                list = map.get(groupSizes[i]);
                temp = list.get(list.size()-1);
                if(temp.size() == groupSizes[i]) {
                    temp = new ArrayList<>();
                } else {
                    list.remove(list.size()-1);
                }

                temp.add(i);
                list.add(temp);
            } else {
                temp = new ArrayList<>();
                list = new ArrayList<>();
                temp.add(i);
                list.add(temp);
            }
            map.put(groupSizes[i], list);
        }

        list = new ArrayList<>();
        for(Integer key : map.keySet()) {
            list.addAll(map.get(key));
        }

        return list;
    }
}