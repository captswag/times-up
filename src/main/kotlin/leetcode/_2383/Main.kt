package leetcode._2383

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of initialEnergy: ")
    val initialEnergy = scanner.nextInt()

    print("Enter the value of initialExperience: ")
    val initialExperience = scanner.nextInt()

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val energy = IntArray(size)
    for (index in energy.indices) {
        print("Enter the value at index $index: ")
        energy[index] = scanner.nextInt()
    }

    val experience = IntArray(size)
    for (index in experience.indices) {
        print("Enter the value at index $index: ")
        experience[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.minNumberOfHours(initialEnergy, initialExperience, energy, experience)

    println("Minimum number of training hours required is: $output")
}