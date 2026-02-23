package refresh._728

class Solution {

    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val ans = mutableListOf<Int>()

        for (v in left..right) {
            var x = v
            var ok = true

            while (x != 0) {
                val d = x % 10
                if (d == 0 || v % d != 0) {
                    ok = false
                    break
                }
                x /= 10
            }

            if (ok) {
                ans.add(v)
            }
        }

        return ans
    }
}