package refresh._1196

class Solution {

    fun maxNumberOfApples(weight: IntArray): Int {
        var totalWeight = 5000
        weight.sort()

        var index = 0
        while (index < weight.size) {
            totalWeight -= weight[index]
            if (totalWeight > -1) {
                index++
            } else {
                break
            }
        }

        return index
    }
}