package leetcode._270

import models.TreeNode

class Solution {
    fun closestValue(root: TreeNode?, target: Double): Int {
        var output = -1
        var maxDiff: Double = Int.MAX_VALUE.toDouble()
        var head = root

        while (head != null) {
            if (head.`val` == output) {
                output = 0
                break
            } else {
                val diff = Math.abs(head.`val` - target)
                if (diff < maxDiff) {
                    maxDiff = diff
                    output = head.`val`
                }
            }
            head = if (target < head.`val`) {
                head.left
            } else {
                head.right
            }
        }

        return output
    }
}