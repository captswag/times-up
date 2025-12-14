package leetcode._3074

class Solution {

    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        capacity.sortDescending()

        var totalCount = 0
        for (count in apple) {
            totalCount += count
        }

        var boxes = 0
        for (c in capacity) {
            if (c >= totalCount) {
                boxes++
                break
            }
            boxes++
            totalCount -= c
        }

        return boxes
    }
}