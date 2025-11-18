package leetcode._3492

class Solution {

    fun maxContainers(n: Int, w: Int, maxWeight: Int): Int {
        return Math.min(n * n, maxWeight / w)
    }
}