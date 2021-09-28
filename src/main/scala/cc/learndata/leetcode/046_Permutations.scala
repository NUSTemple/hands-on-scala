package cc.learndata.leetcode

object Permutations extends App {
    def permute(nums: Array[Int]): List[List[Int]] = {

        nums.permutations.map(x => x.toList).toList
    }
}
