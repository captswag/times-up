package leetcode._3014

class Solution {

    fun minimumPushes(word: String): Int {
        var pushes = 0
        var placeValue = 0
        var index = 0

        while (index < word.length) {
            if (index % 8 == 0) {
                placeValue++
            }
            pushes += placeValue
            index++
        }

        return pushes
    }
}