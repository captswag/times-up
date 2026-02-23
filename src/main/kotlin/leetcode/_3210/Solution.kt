package leetcode._3210

class Solution {

    fun getEncryptedString(s: String, k: Int): String {
        val ans = CharArray(s.length)

        for (i in ans.indices) {
            ans[i] = s[(i + k) % s.length]
        }

        return String(ans)
    }
}