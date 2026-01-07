package refresh._1491

class Solution {

    fun average(salary: IntArray): Double {
        var minSalary = salary[0]
        var maxSalary = salary[0]

        for (s in salary) {
            if (s < minSalary) {
                minSalary = s
            } else if (s > maxSalary) {
                maxSalary = s
            }
        }

        var totalSalary = 0
        var count = 0
        for (s in salary) {
            if (s != minSalary && s != maxSalary) {
                totalSalary += s
                count++
            }
        }

        return totalSalary.toDouble() / count
    }
}