package leetcode._1379;

import models.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Deque<TreeNode> originalQueue = new ArrayDeque<>();
        Deque<TreeNode> clonedQueue = new ArrayDeque<>();

        originalQueue.add(original);
        clonedQueue.add(cloned);

        TreeNode output = null;
        while (!originalQueue.isEmpty()) {
            TreeNode originalNode = originalQueue.remove();
            TreeNode clonedNode = clonedQueue.remove();

            if (originalNode == target) {
                output = clonedNode;
                break;
            } else {
                if (originalNode.getLeft() != null) {
                    originalQueue.add(originalNode.getLeft());
                    clonedQueue.add(clonedNode.getLeft());
                }
                if (originalNode.getRight() != null) {
                    originalQueue.add(originalNode.getRight());
                    clonedQueue.add(clonedNode.getRight());
                }
            }
        }

        return output;
    }
}