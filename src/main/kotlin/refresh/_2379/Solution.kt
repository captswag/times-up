package refresh._2379

import kotlin.math.max

class Solution {

    fun minimumRecolors(blocks: String, k: Int): Int {
        var mx = 0
        var cnt = 0

        for (i in 0 until k) {
            if (blocks[i] == 'B') {
                cnt++
            }
        }
        mx = max(mx, cnt)

        for (i in 1 until blocks.length - k + 1) {
            if (blocks[i - 1] == 'B') {
                cnt--
            }
            if (blocks[i + k - 1] == 'B') {
                cnt++
            }
            mx = max(mx, cnt)
        }

        return k - mx
    }
}