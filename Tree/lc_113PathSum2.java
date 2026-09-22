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
    public List<List<Integer>> pathSum(TreeNode root,int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
     
        help(root,ans,new ArrayList<>(), targetSum);
        return ans;
    }
    public void help(TreeNode root,List<List<Integer>>ans,List<Integer>sa, int t){
        if(root==null){
            return;
        }
      

        sa.add(root.val);
        if(root.left==null && root.right==null && t==root.val){
            ans.add(new ArrayList<>(sa));
        }
        help(root.left,ans,sa, t-root.val);
        help(root.right,ans,sa, t-root.val);
        sa.remove(sa.size()-1);


        
    }
}
