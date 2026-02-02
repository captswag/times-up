package refresh._2515

class Solution {

    fun closestTarget(words: Array<String>, target: String, startIndex: Int): Int {
        if (eq(words[startIndex], target)) {
            return 0
        }

        var i = prev(startIndex, words.size)
        var j = next(startIndex, words.size)
        var cnt = 1

        while (i != startIndex && j != startIndex) {
            if (eq(words[i], target) || eq(words[j], target)) {
                return cnt
            }
            i = prev(i, words.size)
            j = next(j, words.size)
            cnt++
        }

        return -1
    }

    private fun prev(i: Int, size: Int): Int {
        return (i - 1 + size) % size
    }

    private fun next(j: Int, size: Int): Int {
        return (j + 1) % size
    }

    private fun eq(word: String, target: String): Boolean {
        var i = 0
        var j = 0
        while (i < word.length && j < target.length) {
            if (word[i] != target[j]) {
                return false
            }
            i++
            j++
        }
        return i == word.length && j == target.length
    }
}