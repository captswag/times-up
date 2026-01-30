package refresh._2309

class Solution {

    fun greatestLetter(s: String): String {
        var res = ""
        val set = mutableSetOf<Char>()

        for (c in s) {
            if (c in set) {
                val uppercaseC = c.uppercaseChar()
                if (res.isEmpty() || uppercaseC > res[0]) {
                    res = "$uppercaseC"
                }
            } else {
                set.add(toggleCase(c))
            }
        }

        return res
    }

    private fun toggleCase(c: Char): Char {
        return if (c.isLowerCase()) {
            c.uppercaseChar()
        } else {
            c.lowercaseChar()
        }
    }
}