package leetcode._2383

class Solution {

    fun minNumberOfHours(initialEnergy: Int, initialExperience: Int, energy: IntArray, experience: IntArray): Int {
        var iEnergy = initialEnergy

        for (e in energy) {
            iEnergy -= e
        }

        var minHours = 0
        if (iEnergy < 1) {
            minHours += (1 - iEnergy)
        }

        var iExperience = initialExperience
        for (e in experience) {
            if (iExperience > e) {
                iExperience += e
            } else {
                minHours += (e + 1 - iExperience)
                iExperience = (e + 1 + e)
            }
        }

        return minHours
    }
}