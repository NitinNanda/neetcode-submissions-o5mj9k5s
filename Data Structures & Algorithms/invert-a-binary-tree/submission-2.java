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
    public TreeNode invertTree(TreeNode root) {
        // if(root == null) {
        //     return null;
        // }
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);
        // while(!queue.isEmpty()) {
        //     TreeNode node = queue.poll();
        //     TreeNode temp = node.left;
        //     node.left = node.right;
        //     node.right = temp;
        //     if(node.left != null) {
        //         queue.offer(node.left);
        //     }
        //     if(node.right != null) {
        //         queue.offer(node.right);
        //     }
        // }
        // return root;

        // if(root == null) {
        //     return null;
        // }
        // TreeNode temp = root.left;
        // root.left = root.right;
        // root.right = temp;
        // invertTree(root.left);
        // invertTree(root.right);
        // return root;

        if(root == null) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        return root;
    }
}
