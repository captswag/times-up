package leetcode._1491

class Solution {
    fun average(salary: IntArray): Double {
        var minSalaryIndex = 0
        var minSalary = salary[minSalaryIndex]
        var maxSalaryIndex = 0
        var maxSalary = salary[maxSalaryIndex]

        for (index in 1 until salary.size) {
            if (salary[index] < minSalary) {
                minSalaryIndex = index
                minSalary = salary[minSalaryIndex]
            }
            if (salary[index] > maxSalary) {
                maxSalaryIndex = index
                maxSalary = salary[maxSalaryIndex]
            }
        }

        var totalSalary = 0.0
        for (index in salary.indices) {
            if (index != minSalaryIndex && index != maxSalaryIndex) {
                totalSalary += salary[index]
            }
        }

        return totalSalary / (salary.size - 2)
    }
}