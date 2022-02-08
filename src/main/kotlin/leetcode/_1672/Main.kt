package leetcode._1672

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of customers: ")
    val sizeCustomers = scanner.nextInt()

    val accounts = Array(sizeCustomers) { intArrayOf() }
    for (indexCustomers in accounts.indices) {
        print("Enter the number of bank accounts of customer at index $indexCustomers: ")
        val sizeBankAccounts = scanner.nextInt()

        val customer = IntArray(sizeBankAccounts)
        for (indexBankAccounts in customer.indices) {
            customer[indexBankAccounts] = scanner.nextInt()
        }
        accounts[indexCustomers] = customer
    }

    val solution = Solution()
    val output = solution.maximumWealth(accounts)

    println("The richest customer is: $output")
}