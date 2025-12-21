package refresh._1592

class Solution {

    fun reorderSpaces(text: String): String {
        var spaces = 0
        var words = 0

        for (index in text.indices) {
            if (text[index] == ' ') {
                spaces++
            } else if (index == 0 || text[index - 1] == ' ') {
                words++
            }
        }

        val spacesInBetween = if (words == 1) {
            0
        } else {
            spaces / (words - 1)
        }

        val ans = CharArray(text.length)
        var ansIndex = 0
        var wordIndex = 0
        var textIndex = 0

        while (wordIndex < words) {
            while (textIndex < text.length && text[textIndex] == ' ') {
                textIndex++
            }
            while (textIndex < text.length && text[textIndex] != ' ') {
                ans[ansIndex++] = text[textIndex++]
            }
            wordIndex++

            var spacesCount = 0
            while (wordIndex != words && spacesCount < spacesInBetween) {
                ans[ansIndex++] = ' '
                spacesCount++
            }
        }

        while (ansIndex < ans.size) {
            ans[ansIndex++] = ' '
        }

        return String(ans)
    }
}