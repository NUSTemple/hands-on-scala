package cc.learndata.leetcode

object SortedSquares extends App{
    def sortedSquares(nums: Array[Int]): Array[Int] = {
        
        val s = nums.map(x => x * x).sorted
        s
    }
}