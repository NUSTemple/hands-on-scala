package cc.learndata.leetcode

object RemoveElements extends App {

  def removeElements(nums: Array[Int], `val`: Int): Int = {

    val numsCp = nums.clone()
    var i = 0

    if (nums.length > 0) {

      for (x <- numsCp) {

        if (x != `val`) {
          nums(i) = x
          i = i + 1
        }

      }
    } else {}

    i
  }

}
