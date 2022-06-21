package leetcode._804

class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val morseCodes = arrayOf(
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        )

        val output = mutableSetOf<String>()
        for (word in words) {
            val builder = StringBuilder()
            for (index in word.indices) {
                val morseCode = morseCodes[word[index] - 'a']
                builder.append(morseCode)
            }
            output.add(String(builder))
        }
        return output.size
    }
}