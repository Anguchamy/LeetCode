/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        List<Integer> arr = null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            arr = new ArrayList<>();

            while(size-->0) {
                TreeNode temp = queue.remove();
                arr.add(temp.val);

                if(temp.left !=null) {
                    queue.add(temp.left);
                }

                if(temp.right !=null) {
                    queue.add(temp.right);
                }
            }

            res.add(arr);
        }

        return res;
    }
}