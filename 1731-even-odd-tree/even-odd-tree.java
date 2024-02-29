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
import java.util.*;

class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        boolean evenLevel = true;
        
        while (!queue.isEmpty()) {
            int n = queue.size();
            int prev = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            
            while (n-- > 0) {
                TreeNode node = queue.poll();
                
                if (evenLevel && (node.val % 2 == 0 || node.val <= prev)) {
                    return false;
                }
                if (!evenLevel && (node.val % 2 == 1 || node.val >= prev)) {
                    return false;
                }
                
                prev = node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            
            evenLevel = !evenLevel;
        }
        
        return true;
    }
}
