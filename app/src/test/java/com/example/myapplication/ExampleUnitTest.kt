package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun testPibo() {
        assertEquals(0, pibo(0))
        assertEquals(1, pibo(1))
        assertEquals(1, pibo(2))
        assertEquals(2, pibo(3))
        assertEquals(3, pibo(4))
    }

    private fun pibo(n: Int): Int {
        if (n == 0) return 0
        if (n <= 2) return 1
        return pibo(n - 2) + pibo(n - 1)
    }
}