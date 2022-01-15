package leetcode._744

class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var output = letters[0]

        // Binary Search
        var low = 0
        var high = letters.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2
            if (letters[mid] == target || letters[mid] < target) {
                low = mid + 1
            } else {
                output = letters[mid]
                high = mid - 1
            }
        }

        return output
    }
}