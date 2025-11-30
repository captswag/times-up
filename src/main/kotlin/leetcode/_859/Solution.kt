package leetcode._859

class Solution {

    fun buddyStrings(s: String, goal: String): Boolean {
        if (s.length != goal.length) {
            return false
        }

        var firstIndex = -1
        var secondIndex = -1
        var numberOfMismatches = 0
        val set = mutableSetOf<Char>()
        var multipleOccurrence = false
        for (index in s.indices) {
            if (s[index] != goal[index]) {
                if (firstIndex == -1) {
                    firstIndex = index
                } else {
                    secondIndex = index
                }
                numberOfMismatches++
            }
            if (set.contains(s[index])) {
                multipleOccurrence = true
            } else {
                set.add(s[index])
            }
        }

        return when (numberOfMismatches) {
            2 -> {
                s[firstIndex] == goal[secondIndex] && s[secondIndex] == goal[firstIndex]
            }
            0 -> {
                multipleOccurrence
            }
            else -> {
                false
            }
        }
    }
}