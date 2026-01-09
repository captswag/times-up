package refresh._1370

class Solution {

    fun sortString(s: String): String {
        val frequency = IntArray(26)
        val set = mutableSetOf<Char>()

        for (c in s) {
            frequency[c - 'a']++
            set.add(c)
        }

        var index = 0
        var ascending = true
        val res = StringBuilder()
        while (set.isNotEmpty()) {
            if (index == -1) {
                index = 0
                ascending = true
            } else if (index == 26) {
                index = 25
                ascending = false
            } else {
                if (frequency[index] > 0) {
                    val char = (index + 'a'.code).toChar()
                    res.append(char)
                    frequency[index]--
                    if (frequency[index] == 0) {
                        set.remove(char)
                    }
                }
                if (ascending) {
                    index++
                } else {
                    index--
                }
            }
        }

        return res.toString()
    }
}