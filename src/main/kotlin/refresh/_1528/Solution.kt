package refresh._1528

class Solution {

    fun restoreString(s: String, indices: IntArray): String {
        val res = CharArray(s.length)

        for (i in s.indices) {
            res[indices[i]] = s[i]
        }

        return String(res)
    }
}