package refresh._3304

class Solution {

    fun kthCharacter(k: Int): Char {
        val sb = StringBuilder()
        sb.append('a')

        while (sb.length < k) {
            val n = sb.length
            for (i in 0 until n) {
                val nx = ((sb[i] - 'a') + 1) % 26
                sb.append((nx + 97).toChar())
            }
        }

        return sb[k - 1]
    }
}