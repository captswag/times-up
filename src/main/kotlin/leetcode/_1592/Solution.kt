package leetcode._1592

class Solution {
    fun reorderSpaces(text: String): String {
        var wordCounter = 0
        var wordStarted = false
        var spaceCounter = 0
        for (index in 0..text.length) {
            if (index == text.length) {
                if (wordStarted) {
                    wordStarted = false
                    wordCounter++
                }
            } else if (text[index] == ' ') {
                spaceCounter++
                if (wordStarted) {
                    wordStarted = false
                    wordCounter++
                }
            } else if (text[index].isLetter()) {
                wordStarted = true
            }
        }

        wordCounter--
        val equalSpaces: Int
        val extraSpaces: Int
        if (wordCounter == 0) {
            equalSpaces = 0
            extraSpaces = spaceCounter
        } else {
            equalSpaces = spaceCounter / wordCounter
            extraSpaces = spaceCounter - (wordCounter * equalSpaces)
        }

        val sb = StringBuilder()

        wordStarted = false
        val totalSpacesWithoutExtra = wordCounter * equalSpaces
        var currentSpacesCounter = 0
        for (c in text) {
            if (c.isLetter()) {
                wordStarted = true
                sb.append(c)
            } else if (c == ' ') {
                if (wordStarted) {
                    wordStarted = false
                    // And add equalSpaces
                    for (index in 0 until equalSpaces) {
                        if (currentSpacesCounter < totalSpacesWithoutExtra) {
                            sb.append(' ')
                            currentSpacesCounter++
                        }
                    }
                }
            }
        }

        for (counter in 0 until extraSpaces) {
            sb.append(' ')
        }

        return sb.toString()
    }
}