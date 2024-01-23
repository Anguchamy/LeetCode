/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if/l z.  it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer;kbj
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    Queue<Integer> queue;
    public NestedIterator(List<NestedInteger> nestedList) {
        queue = new LinkedList<>();
        readList(nestedList, queue);
    }

    @Override
    public Integer next() {
        return queue.remove();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public void readList(List<NestedInteger> nestedList, Queue<Integer> queue) {
        for(NestedInteger nestedInteger : nestedList) {
            if(nestedInteger.isInteger()) {
                queue.add(nestedInteger.getInteger());
            } else {
                readList(nestedInteger.getList(), queue);
            }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */