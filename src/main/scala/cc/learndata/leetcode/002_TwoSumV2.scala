package cc.learndata.leetcode
import scala.util.control.Breaks

object TwoSumV2 extends App {

  def findSumPair(nums: Array[Int], target: Int): Array[Int] = {

    var i = 0
    var idx = Array[Int]()

    Breaks.breakable {
      for (i <- 0 until (nums.length - 1)) {
        for (j <- (i + 1) until nums.length ) {
            println(i, j, nums(i), nums(j))
          if (nums(i) + nums(j) == target) {
            idx = Array(i, j)
            Breaks.break()
          }

        }

      }

    }
    idx
  }

}
