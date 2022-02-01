package leetcode._1370

class Solution {
    fun sortString(s: String): String {
        // Storing the count of each character in the given array
        val alphabets = 26
        val alphabetsCount = IntArray(alphabets)
        var count = 0
        for (c in s) {
            alphabetsCount[c - 'a']++
            count++
        }

        val sb = StringBuilder()
        var forward = true
        for (index in 0 until count) {
            forward = if (forward) {
                for (alphabetsIndex in 0 until alphabets) {
                    if (alphabetsCount[alphabetsIndex] > 0) {
                        sb.append((alphabetsIndex + 97).toChar())
                        alphabetsCount[alphabetsIndex]--
                    }
                }
                false
            } else {
                for (alphabetsIndex in alphabets - 1 downTo 0) {
                    if (alphabetsCount[alphabetsIndex] > 0) {
                        sb.append((alphabetsIndex + 97).toChar())
                        alphabetsCount[alphabetsIndex]--
                    }
                }
                true
            }
        }

        return sb.toString()
    }
}