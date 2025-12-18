package refresh._1304

class Solution {

    fun sumZero(n: Int): IntArray {
        val res = IntArray(n)
        var index = 0

        if (n and 1 == 1) {
            res[index++] = 0
        }

        var value = 1
        while (index < res.size) {
            res[index++] = value
            res[index++] = value * -1
            value++
        }

        return res
    }
}