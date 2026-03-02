package refresh._1539

class Solution {

    fun findKthPositive(arr: IntArray, k: Int): Int {
        var rem = k
        var cur = 0
        var i = 0

        while (rem > 0) {
            cur++
            if (i < arr.size && cur == arr[i]) {
                i++
            } else {
                rem--
            }
        }

        return cur
    }
}