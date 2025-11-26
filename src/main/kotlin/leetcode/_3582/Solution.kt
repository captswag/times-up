package leetcode._3582

class Solution {

    fun generateTag(caption: String): String {
        val tag = CharArray(100)
        tag[0] = '#'
        var size = 1
        var capNext = false
        var ci = 0

        while (ci < caption.length && size < 100) {
            when (caption[ci]) {
                ' ' -> {
                    capNext = size != 1
                }
                else -> {
                    if (capNext) {
                        tag[size] = caption[ci].uppercaseChar()
                        capNext = false
                    } else {
                        tag[size] = caption[ci].lowercaseChar()
                    }
                    size++
                }
            }
            ci++
        }

        return String(tag, 0, size)
    }
}