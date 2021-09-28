package cc.learndata.leetcode

object Search2DMatrix extends App {
    def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {

        for (row <- matrix) {
            for (col <- row) {
                if (col == target) return true
            }
        }

        false
    }
}