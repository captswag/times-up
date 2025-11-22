package leetcode._3581

class Solution {

    fun countOddLetters(n: Int): Int {
        val map = mapOf(
            0 to "zero",
            1 to "one",
            2 to "two",
            3 to "three",
            4 to "four",
            5 to "five",
            6 to "six",
            7 to "seven",
            8 to "eight",
            9 to "nine"
        )

        val frequency = IntArray(26)
        var n = n
        while (n != 0) {
            val mod = n % 10
            for (c in map.getOrDefault(mod, "")) {
                frequency[c - 'a']++
            }
            n /= 10
        }

        var output = 0
        for (f in frequency) {
            if (f and 1 == 1) {
                output++
            }
        }

        return output
    }
}