package leetcode._1431

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var index = 0
        var maximumCandies = candies[index]

        index++
        while (index < candies.size) {
            if (candies[index] > maximumCandies) {
                maximumCandies = candies[index]
            }
            index++
        }

        val output = mutableListOf<Boolean>()
        for (candy in candies) {
            if (candy + extraCandies >= maximumCandies) {
                output.add(true)
            } else {
                output.add(false)
            }
        }
        return output
    }
}