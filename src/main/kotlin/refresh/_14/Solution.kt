package refresh._14

class Solution {

    fun longestCommonPrefix(strs: Array<String>): String {
        val sb = StringBuilder()

        for (i in strs[0].indices) {
            for (j in 1 until strs.size) {
                if (i >= strs[j].length || strs[0][i] != strs[j][i]) {
                    return sb.toString()
                }
            }
            sb.append(strs[0][i])
        }

        return sb.toString()
    }
}