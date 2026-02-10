package refresh._682

class Solution {

    fun calPoints(operations: Array<String>): Int {
        val stk = IntArray(operations.size)
        var size = 0

        for (x in operations) {
            when (x) {
                "+" -> {
                    stk[size] = stk[size - 1] + stk[size - 2]
                    size++
                }
                "D" -> {
                    stk[size] = stk[size - 1] * 2
                    size++
                }
                "C" -> {
                    size--
                }
                else -> {
                    stk[size++] = x.toInt()
                }
            }
        }

        var sum = 0
        for (i in 0 until size) {
            sum += stk[i]
        }

        return sum
    }
}