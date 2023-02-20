package basics.nqueen

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of N for the NxN chess board: ")
    val n = scanner.nextInt()

    val nQueen = NQueen()
    nQueen.solve(n)
}