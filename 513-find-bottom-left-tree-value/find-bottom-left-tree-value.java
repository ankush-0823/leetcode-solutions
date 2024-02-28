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
    int result = 0; // Declare result variable as a class field
    int md=-1;
    public void dfs(TreeNode root, int cd) {
        if (root == null) // Base case: If the root is null, return
            return;
        
        // Update result if the current depth is greater than the maximum depth seen so far
        if (cd > md) {
            md = cd;
            result = root.val; // Update result with the value of the current node
        }
        
        // Traverse left and right subtrees, incrementing depth by 1
        dfs(root.left, cd + 1);
        dfs(root.right, cd + 1);
    }

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0); // Start DFS traversal from the root with initial depth 0
        return result; // Return the result
    }
}
