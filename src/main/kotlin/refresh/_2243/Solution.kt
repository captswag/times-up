package refresh._2243

class Solution {

    fun digitSum(s: String, k: Int): String {
        var updatedS = s

        while (updatedS.length > k) {
            var index = 0
            val currS = StringBuilder()

            while (index < updatedS.length) {
                val kIndex = Math.min(index + k, updatedS.length)
                var sum = 0

                while (index < kIndex) {
                    sum += updatedS[index++] - '0'
                }

                currS.append(sum)
            }

            updatedS = currS.toString()
        }

        return updatedS
    }
}