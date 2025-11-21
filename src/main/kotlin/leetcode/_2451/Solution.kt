package leetcode._2451

class Solution {

    fun oddString(words: Array<String>): String {
        var output = ""

        for (wordIndex in 0 until words.size - 2) {
            for (characterIndex in 0 until words[wordIndex].length - 1) {
                val a = words[wordIndex][characterIndex + 1] - words[wordIndex][characterIndex]
                val b = words[wordIndex + 1][characterIndex + 1] - words[wordIndex + 1][characterIndex]
                val c = words[wordIndex + 2][characterIndex + 1] - words[wordIndex + 2][characterIndex]

                if (a == b) {
                    if (a != c) {
                        output = words[wordIndex + 2]
                        break
                    }
                } else {
                    if (a == c) {
                        output = words[wordIndex + 1]
                        break
                    } else {
                        output = words[wordIndex]
                        break
                    }
                }
            }
        }

        return output
    }
}