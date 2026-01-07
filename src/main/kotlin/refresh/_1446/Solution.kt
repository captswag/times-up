package refresh._1446

class Solution {

    fun maxPower(s: String): Int {
        var i = 0
        var maxPower = 1

        while (i < s.length - 1) {
            var j = i
            while (j < s.length - 1 && s[j] == s[j + 1]) {
                j++
            }
            val currPower = j - i + 1
            if (currPower > maxPower) {
                maxPower = currPower
            }
            i = j + 1
        }

        return maxPower
    }
}