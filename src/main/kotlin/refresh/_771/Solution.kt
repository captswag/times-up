package refresh._771

class Solution {

    fun numJewelsInStones(jewels: String, stones: String): Int {
        val isJewel = BooleanArray(52)

        for (c in jewels) {
            if (c.isUpperCase()) {
                isJewel[c - '\''] = true
            } else {
                isJewel[c - 'a'] = true
            }
        }

        var res = 0
        for (c in stones) {
            if (c.isUpperCase()) {
                if (isJewel[c - '\'']) {
                    res++
                }
            } else {
                if (isJewel[c - 'a']) {
                    res++
                }
            }
        }

        return res
    }
}