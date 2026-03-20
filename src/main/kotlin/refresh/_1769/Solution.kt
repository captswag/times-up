package refresh._1769

class Solution {

    fun minOperations(boxes: String): IntArray {
        var cnt = 0
        var sum = 0
        val ans = IntArray(boxes.length)

        for (i in 1 until boxes.length) {
            cnt += boxes[i - 1] - '0'
            sum += cnt
            ans[i] = sum
        }

        cnt = 0
        sum = 0

        for (i in boxes.length - 2 downTo 0) {
            cnt += boxes[i + 1] - '0'
            sum += cnt
            ans[i] += sum
        }

        return ans
    }
}