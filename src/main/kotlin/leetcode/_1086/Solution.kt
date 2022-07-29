package leetcode._1086

import java.util.*

class Solution {
    fun highFive(items: Array<IntArray>): Array<IntArray> {
        val map = TreeMap<Int, Queue<Int>>()

        for (item in items) {
            val id = item[0]
            val mark = item[1]

            val minQueue = map.getOrDefault(id, PriorityQueue())
            minQueue.offer(mark)
            if (minQueue.size > 5) {
                minQueue.poll()
            }
            map[id] = minQueue
        }

        val output = Array(map.keys.count()) { IntArray(2) }
        for ((index, key) in map.keys.withIndex()) {
            val minQueue = map.getOrDefault(key, PriorityQueue())
            val count = minQueue.size
            var totalMarks = 0
            while (minQueue.isNotEmpty()) {
                totalMarks += minQueue.poll()
            }
            output[index] = intArrayOf(key, totalMarks / count)
        }

        return output
    }
}