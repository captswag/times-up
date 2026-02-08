package refresh._3216

class Solution {

    fun getSmallestString(s: String): String {
        val a = s.toCharArray()

        for (i in 0 until a.size - 1) {
            if ((a[i] - '0' and 1) + (a[i + 1] - '0' and 1) != 1 && a[i] > a[i + 1]) {
                val temp = a[i]
                a[i] = a[i + 1]
                a[i + 1] = temp
                break
            }
        }

        return String(a)
    }
}