package refresh._2194

class Solution {

    fun cellsInRange(s: String): List<String> {
        val res = mutableListOf<String>()

        for (r in s[0] - 'A'..s[3] - 'A') {
            for (c in s[1] - '0'..s[4] - '0') {
                res.add("${(r + 'A'.code).toChar()}$c")
            }
        }

        return res
    }
}