package refresh._1742

class Solution {

    fun countBalls(lowLimit: Int, highLimit: Int): Int {
        val map = mutableMapOf<Int, Int>()
        var maxBalls = 1

        for (i in lowLimit..highLimit) {
            var num = i
            var sum = 0
            while (num != 0) {
                sum += (num % 10)
                num /= 10
            }
            map[sum] = map.getOrDefault(sum, 0) + 1
            if (map.getValue(sum) > maxBalls) {
                maxBalls = map.getValue(sum)
            }
        }

        return maxBalls
    }
}