class Solution {
    int result=0;
    boolean res = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(null==root){
            return res;
        }
        result = sum;
        sum(root,0);
        return res;
    }
    
    private void sum(TreeNode root,int prev) {
        if(root==null) {
            return; 
        }
        
        if(root.left==null && root.right==null){
            if((root.val+prev) == result) {
                res = true;
            }
        }
        
        sum(root.left,root.val+prev);
        sum(root.right,root.val+prev);
    }
}