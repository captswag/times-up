package leetcode._1791

class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        val edge1 = edges[0][0]
        val edge2 = edges[0][1]

        return if (edge1 == edges[1][0] || edge1 == edges[1][1]) {
            edge1
        } else {
            edge2
        }
    }
}