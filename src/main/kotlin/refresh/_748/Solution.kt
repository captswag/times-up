package refresh._748

class Solution {

    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        val licensePlateFrequency = IntArray(26)

        for (c in licensePlate) {
            if (c.isLetter()) {
                if (c.isLowerCase()) {
                    licensePlateFrequency[c - 'a']++
                } else {
                    licensePlateFrequency[c - 'A']++
                }
            }
        }

        var ans = ""
        for (word in words) {
            val wordFrequency = IntArray(26)

            for (c in word) {
                wordFrequency[c - 'a']++
            }

            for (index in licensePlateFrequency.indices) {
                if (licensePlateFrequency[index] - wordFrequency[index] > 0) {
                    break
                } else if (index == licensePlateFrequency.size - 1) {
                    if (ans == "" || word.length < ans.length) {
                        ans = word
                    }
                }
            }
        }

        return ans
    }
}