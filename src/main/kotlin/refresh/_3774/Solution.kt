package refresh._3774

import kotlin.math.min

class Solution {

    fun absDifference(nums: IntArray, k: Int): Int {
        val cnt = IntArray(101)

        for (x in nums) {
            cnt[x]++
        }

        var rem = k
        var i = 1
        var mn = 0

        while (rem > 0) {
            if (cnt[i] > 0) {
                val take = min(rem, cnt[i])
                mn += (take * i)
                rem -= take
                if (cnt[i] == take) {
                    i++
                }
            } else {
                i++
            }
        }

        rem = k
        i = cnt.size - 1
        var mx = 0

        while (rem > 0) {
            if (cnt[i] > 0) {
                val take = min(rem, cnt[i])
                mx += (take * i)
                rem -= take
                cnt[i] -= take
            } else {
                i--
            }
        }

        return mx - mn
    }
}