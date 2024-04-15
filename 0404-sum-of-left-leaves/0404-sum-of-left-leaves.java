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

    //main method
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }

    //helper method
    public int sum(TreeNode node) {
        if(node==null) return 0;

        int leftSum = 0;
        if(node.left!=null && node.left.left==null && node.left.right==null) {
            leftSum += node.left.val;
        }
        int leftSubtreeSum = sum(node.left);
        int rightSubtreeSum = sum(node.right);
        return leftSum + leftSubtreeSum + rightSubtreeSum;
    }

}