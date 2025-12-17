package refresh._541

class Solution {

    fun reverseStr(s: String, k: Int): String {
        val c = s.toCharArray()
        var placeValue = 0
        var left = 0

        while (left < s.length) {
            var right = left + k - 1
            if (right >= s.length) {
                right = s.length - 1
            }

            while (left < right) {
                val temp = c[right]
                c[right] = c[left]
                c[left] = temp
                left++
                right--
            }

            placeValue += 2
            left = placeValue * k
        }

        return String(c)
    }
}