package refresh._830

class Solution {

    fun largeGroupPositions(s: String): List<List<Int>> {
        var i = 0
        val res = mutableListOf<List<Int>>()

        while (i < s.length) {
            val j = i
            while (i < s.length && s[i] == s[j]) {
                i++
            }
            if (i - j >= 3) {
                res.add(listOf(j, i - 1))
            }
        }

        return res
    }
}