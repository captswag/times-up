package refresh._832

class Solution {

    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        for (x in image.indices) {
            var left = 0
            var right = image[x].size - 1
            while (left <= right) {
                if (left == right) {
                    image[x][left] = image[x][left] xor 1
                } else {
                    val temp = image[x][right]
                    image[x][right] = image[x][left] xor 1
                    image[x][left] = temp xor 1
                }
                left++
                right--
            }
        }

        return image
    }
}