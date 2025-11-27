package leetcode._455

class Solution {

    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        var gIndex = 0
        s.sort()
        var sIndex = 0
        var contentChildren = 0

        while (gIndex < g.size && sIndex < s.size) {
            if (s[sIndex] >= g[gIndex]) {
                contentChildren++
                sIndex++
                gIndex++
            } else {
                sIndex++
            }
        }

        return contentChildren
    }
}