package leetcode._1869

class Solution {
    fun checkZeroOnes(s: String): Boolean {
        var max1 = 0
        var max1Current = 0
        var max0 = 0
        var max0Current = 0
        var index = 0

        if (s[index] == '1') {
            max1Current++
        } else {
            max0Current++
        }
        index++

        while (index <= s.length) {
            if (index == s.length) {
                if (max1Current > 0 && max1Current > max1) {
                    max1 = max1Current
                } else if (max0Current > 0 && max0Current > max0) {
                    max0 = max0Current
                }
            } else if (s[index] == '1') {
                max1Current++
                if (max0Current > 0) {
                    max0 = Math.max(max0Current, max0)
                    max0Current = 0
                }
            } else {
                max0Current++
                if (max1Current > 0) {
                    max1 = Math.max(max1Current, max1)
                    max1Current = 0
                }
            }
            index++
        }

        return max1 > max0
    }
}