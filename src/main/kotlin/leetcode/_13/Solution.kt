package leetcode._13

class Solution {
    fun romanToInt(s: String): Int {
        var index = 0
        var number = 0

        while (index < s.length) {
            val char = s[index]
            when (char) {
                'I' -> {
                    number += if (hasNextIndex(index, s)) {
                        when (s[index + 1]) {
                            'V' -> {
                                index++
                                4
                            }
                            'X' -> {
                                index++
                                9
                            }
                            else -> 1
                        }
                    } else {
                        1
                    }
                }
                'V' -> number += 5
                'X' -> {
                    number += if (hasNextIndex(index, s)) {
                        when (s[index + 1]) {
                            'L' -> {
                                index++
                                40
                            }
                            'C' -> {
                                index++
                                90
                            }
                            else -> 10
                        }
                    } else {
                        10
                    }
                }
                'L' -> number += 50
                'C' -> {
                    number += if (hasNextIndex(index, s)) {
                        when (s[index + 1]) {
                            'D' -> {
                                index++
                                400
                            }
                            'M' -> {
                                index++
                                900
                            }
                            else -> 100
                        }
                    } else {
                        100
                    }
                }
                'D' -> number += 500
                'M' -> number += 1000
            }
            index++
        }

        return number
    }

    private fun hasNextIndex(currentIndex: Int, s: String): Boolean = currentIndex + 1 < s.length
}