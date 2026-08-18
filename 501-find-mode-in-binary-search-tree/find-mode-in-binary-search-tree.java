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
    int currentCount = 0;
    int maxCount = 0;
    Integer previous = null;
    List<Integer> result = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (previous == null || root.val != previous) {
            currentCount = 1;
        } else {
            currentCount++;
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
            result.clear();
            result.add(root.val);
        } else if (currentCount == maxCount) {
            result.add(root.val);
        }
        previous = root.val;
        inorder(root.right);
    }
}