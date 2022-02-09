package leetcode._2138

class Solution {
    fun divideString(s: String, k: Int, fill: Char): Array<String> {
        var totalSize = 0
        val div = s.length / k
        val mod = s.length % k
        totalSize += div
        if (mod > 0) {
            totalSize++
        }

        val output = Array(totalSize) { "" }
        var kCounter = 0
        var totalIndex = 0
        val sb = StringBuilder()
        for (index in s.indices) {
            if (kCounter == 0) {
                sb.append(s[index])
                kCounter++
                if (kCounter == k) {
                    output[totalIndex] = sb.toString()
                    totalIndex++
                    sb.clear()
                    kCounter = 0
                }
            } else if (kCounter < k) {
                sb.append(s[index])
                kCounter++
                if (kCounter == k) {
                    output[totalIndex] = sb.toString()
                    totalIndex++
                    sb.clear()
                    kCounter = 0
                }
            }
        }

        if (sb.isNotEmpty()) {
            while (kCounter < k) {
                sb.append(fill)
                kCounter++
            }
            output[totalIndex] = sb.toString()
            sb.clear()
        }

        return output
    }
}