package leetcode._1769

class Solution {

    fun minOperations(boxes: String): IntArray {
        var l = 0
        var lcnt = 0
        var r = 0
        var rcnt = 0

        for (i in boxes.indices) {
            if (boxes[i] == '1') {
                r += (i + 1)
                rcnt++
            }
        }

        var prv = '0'
        val ans = IntArray(boxes.length)

        for (i in boxes.indices) {
            if (prv == '1') {
                lcnt++
            }
            l += lcnt

            r -= rcnt
            if (boxes[i] == '1') {
                rcnt--
            }

            ans[i] = l + r
            prv = boxes[i]
        }

        return ans
    }
}