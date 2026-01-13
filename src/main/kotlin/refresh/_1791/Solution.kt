package refresh._1791

class Solution {

    fun findCenter(edges: Array<IntArray>): Int {
        val node0 = edges[0][0]
        val node1 = edges[0][1]

        return if (node0 == edges[1][0] || node0 == edges[1][1]) {
            node0
        } else {
            node1
        }
    }
}