package cc.learndata.leetcode



object PowerOfTwo extends App {

    def isPowerOfTwo(n: Int): Boolean = {

        if (n == 1) return true
        if (n < 1) return false

        if (n % 2 == 1) false else isPowerOfTwo(n >> 1)
    }
}

