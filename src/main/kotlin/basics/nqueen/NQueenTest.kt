package basics.nqueen

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


internal class NQueenTest {

    lateinit var nQueen: NQueen

    @BeforeEach
    fun setUp() {
        nQueen = NQueen()
    }

    @Test
    fun isValidPosition1() {
        val board =
            arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 1), intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0))
        assertTrue(nQueen.isValidPosition(board, 3, 2))
    }

    @Test
    fun isValidPosition2() {
        val board =
            arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0))
        assertTrue(nQueen.isValidPosition(board, 0, 0))
    }

    @Test
    fun isValidPosition3() {
        val board =
            arrayOf(intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0))
        assertTrue(nQueen.isValidPosition(board, 1, 2))
    }

    @Test
    fun isValidPosition4() {
        val board =
            arrayOf(intArrayOf(0, 0, 0, 1), intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0))
        assertTrue(nQueen.isValidPosition(board, 2, 2))
    }

    @Test
    fun isValidPosition5() {
        val board =
            arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 1), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 1, 0))
        assertTrue(nQueen.isValidPosition(board, 2, 0))
    }

    @Test
    fun isValidPosition6() {
        val board =
            arrayOf(intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 1, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0))
        assertFalse(nQueen.isValidPosition(board, 2, 1))
    }

    @Test
    fun isValidPosition7() {
        val board =
            arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 1), intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0))
        assertFalse(nQueen.isValidPosition(board, 2, 2))
    }

    @Test
    fun isValidPosition8() {
        val board =
            arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 1), intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0))
        assertFalse(nQueen.isValidPosition(board, 3, 3))
    }

    @Test
    fun isValidPosition9() {
        val board =
            arrayOf(intArrayOf(0, 0, 0, 1), intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0))
        assertFalse(nQueen.isValidPosition(board, 3, 0))
    }

    @Test
    fun isValidPosition10() {
        val board =
            arrayOf(intArrayOf(0, 0, 0, 1), intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 0))
        assertFalse(nQueen.isValidPosition(board, 3, 2))
    }

    @Test
    fun findCurrentColumnPosition1() {
        val row = intArrayOf(0, 0, 1, 0)
        Assertions.assertEquals(2, nQueen.findCurrentColumnPosition(row))
    }

    @Test
    fun findCurrentColumnPosition2() {
        val row = intArrayOf(1, 0, 0, 0)
        Assertions.assertEquals(0, nQueen.findCurrentColumnPosition(row))
    }

    @Test
    fun findCurrentColumnPosition3() {
        val row = intArrayOf(0, 0, 0, 0, 0, 1, 0, 0)
        Assertions.assertEquals(5, nQueen.findCurrentColumnPosition(row))
    }

    @Test
    fun findCurrentColumnPosition4() {
        val row = intArrayOf(0, 0, 0, 0, 1, 0, 1, 0)
        Assertions.assertEquals(4, nQueen.findCurrentColumnPosition(row))
    }

    @Test
    fun findCurrentColumnPosition5() {
        val row = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0)
        Assertions.assertEquals(-1, nQueen.findCurrentColumnPosition(row))
    }

    @Test
    fun printNQueen() {
        val testOutputStream = ByteArrayOutputStream()
        val originalOutputStream = System.out

        System.setOut(PrintStream(testOutputStream))

        val board =
            arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(0, 0, 0, 1), intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 1, 0))
        nQueen.printNQueen(board)

        Assertions.assertEquals(
            "0    1    0    0\n0    0    0    1\n1    0    0    0\n0    0    1    0\n", testOutputStream.toString()
        )

        System.setOut(originalOutputStream)
    }
}