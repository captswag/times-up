package refresh._1196

class Solution {

    fun maxNumberOfApples(weight: IntArray): Int {
        var rem = 5000
        var i = 0
        weight.sort()

        while (rem > 0 && i < weight.size && weight[i] <= rem) {
            rem -= weight[i]
            i++
        }

        return i
    }
}