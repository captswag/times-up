package leetcode._832

class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        for (rowIndex in image.indices) {
            var columnStart = 0
            var columnEnd = image[rowIndex].size - 1
            while (columnStart <= columnEnd) {
                if (columnStart == columnEnd) {
                    image[rowIndex][columnStart] = image[rowIndex][columnStart] xor 1
                } else {
                    image[rowIndex][columnStart] = image[rowIndex][columnStart] xor 1
                    image[rowIndex][columnEnd] = image[rowIndex][columnEnd] xor 1
                    val temp = image[rowIndex][columnStart]
                    image[rowIndex][columnStart] = image[rowIndex][columnEnd]
                    image[rowIndex][columnEnd] = temp
                }
                columnStart++
                columnEnd--
            }
        }
        return image
    }
}