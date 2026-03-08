package leetcode._3861

class Solution {

    fun minimumIndex(capacity: IntArray, itemSize: Int): Int {
        var idx = -1

        for (i in capacity.indices) {
            if (capacity[i] >= itemSize && (idx == -1 || capacity[i] < capacity[idx])) {
                idx = i
            }
        }

        return idx
    }
}