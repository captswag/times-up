package leetcode._1455

class Solution {
    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        var output = 1
        var matchFailed = false
        var searchWordIndex = 0
        var isPrefix = false

        for (c in sentence) {
            if (c.isLetter() && !matchFailed) {
                if (searchWordIndex < searchWord.length) {
                    if (c == searchWord[searchWordIndex]) {
                        searchWordIndex++
                        if (searchWordIndex == searchWord.length) {
                            // This means we found the solution
                            isPrefix = true
                            break
                        }
                    } else {
                        matchFailed = true
                        searchWordIndex = 0
                    }
                }
            } else if (c == ' ') {
                searchWordIndex = 0
                matchFailed = false
                output++
            }
        }
        return if (isPrefix) output else -1
    }
}