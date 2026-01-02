package refresh._830

class Solution {

    fun largeGroupPositions(s: String): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        var index = 1

        while (index < s.length) {
            if (s[index] == s[index - 1]) {
                val start = index - 1
                index++
                var count = 2
                while (index < s.length && s[index] == s[index - 1]) {
                    count++
                    index++
                }
                if (count >= 3) {
                    res.add(listOf(start, index - 1))
                }
                index++
            } else {
                index++
            }
        }

        return res
    }
}