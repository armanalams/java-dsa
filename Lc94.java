
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        
        inorder(root, ans);
        
        return ans;
    }

    public void inorder(TreeNode root, List<Integer> ans) {
        
        if (root == null) {
            return;
        }
        
        // 1. Visit Left Subtree
        inorder(root.left, ans);
        
        // 2. Visit Root
        ans.add(root.val);
        
        // 3. Visit Right Subtree
        inorder(root.right, ans);
    }
}
