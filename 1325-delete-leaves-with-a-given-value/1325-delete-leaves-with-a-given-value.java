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

    // post order because question states that
    // once you delete a leaf node with value target, if its parent node becomes a leaf node and has the value target, it should       //also be deleted (you need to continue doing that until you cannot).
    
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return root;

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if (root.left == null && root.right == null && root.val == target) root = null;

        return root;
    }
    
}
