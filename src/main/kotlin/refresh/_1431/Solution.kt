package refresh._1431

class Solution {

    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var greatest = 1

        for (c in candies) {
            if (c > greatest) {
                greatest = c
            }
        }

        val res = mutableListOf<Boolean>()
        for (c in candies) {
            if (c + extraCandies >= greatest) {
                res.add(true)
            } else {
                res.add(false)
            }
        }

        return res
    }
}