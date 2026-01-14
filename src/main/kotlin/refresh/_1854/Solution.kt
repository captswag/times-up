package refresh._1854

class Solution {

    fun maximumPopulation(logs: Array<IntArray>): Int {
        val populationDelta = IntArray(101)

        for (log in logs) {
            populationDelta[log[0] - 1950]++
            populationDelta[log[1] - 1950]--
        }

        var i = 0
        var maxPopulation = populationDelta[i]
        var maxPopulationYear = i
        i++

        while (i < populationDelta.size) {
            populationDelta[i] += populationDelta[i - 1]
            if (populationDelta[i] > maxPopulation) {
                maxPopulation = populationDelta[i]
                maxPopulationYear = i
            }
            i++
        }

        return maxPopulationYear + 1950
    }
}