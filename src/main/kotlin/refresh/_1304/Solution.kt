package refresh._1304

class Solution {

    fun sumZero(n: Int): IntArray {
        val mid = n / 2
        val res = IntArray(n)
        var index = 0

        for (value in (mid * -1) until (mid + 1)) {
            if (value != 0) {
                res[index++] = value
            }
        }

        return res
    }
}