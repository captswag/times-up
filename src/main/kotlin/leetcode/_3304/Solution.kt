package leetcode._3304

class Solution {

    fun kthCharacter(k: Int): Char {
        val sb = StringBuilder()
        sb.append('a')

        while (sb.length < k) {
            val sz = sb.length
            for (i in 0 until sz) {
                sb.append(((((sb[i] - 'a') + 1) % 26) + 'a'.code).toChar())
            }
        }

        return sb[k - 1]
    }
}