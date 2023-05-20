package leetcode._2363

import java.util.*

class Solution {
    fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
        val output = mutableListOf<List<Int>>()
        val itemMap = TreeMap<Int, Int>()

        for (item in items1) {
            itemMap[item[0]] = item[1]
        }

        for (item in items2) {
            itemMap[item[0]] = itemMap.getOrDefault(item[0], 0) + item[1]
        }

        for (key in itemMap.keys) {
            output.add(listOf(key, itemMap.getOrDefault(key, 0)))
        }

        return output
    }
}