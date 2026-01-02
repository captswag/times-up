package refresh._804

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

        val set = mutableSetOf<String>()
        val sb = StringBuilder()

        for (word in words) {
            for (c in word) {
                sb.append(morseCodes[c - 'a'])
            }
            set.add(sb.toString())
            sb.setLength(0)
        }

        return set.size
    }
}