package leetcode._599

class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val map = mutableMapOf<String, Int>()

        for (index in list1.indices) {
            map[list1[index]] = index
        }

        var minSum = Integer.MAX_VALUE
        val output = mutableListOf<String>()

        for (index2 in list2.indices) {
            val index1 = map[list2[index2]]
            if (index1 != null) {
                if (index1 + index2 == minSum) {
                    // Means there's a choice tie
                    output.add(list2[index2])
                } else if (index1 + index2 < minSum) {
                    minSum = index1 + index2
                    output.clear()
                    output.add(list2[index2])
                }
            }
        }

        return output.toTypedArray()
    }
}