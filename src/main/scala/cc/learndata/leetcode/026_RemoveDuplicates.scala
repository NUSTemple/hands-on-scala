package cc.learndata.leetcode

object RemoveDuplicates extends App {

  def removeDuplicates(nums: Array[Int]): Int = {
    val numsCp = nums.clone().sorted
    var i = 0

    if (nums.length > 0) {
      var tmp = numsCp(0) - 1

      for (x <- numsCp) {

        if (x != tmp) {
          nums(i) = x
          tmp = x
          i = i + 1
        }

      }
    } else {}

    i
  }

}
