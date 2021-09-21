package cc.learndata.leetcode

object MoveZeros extends App {
  def moveZeros(nums: Array[Int]): Unit = {
    var i = 0
    val nums_cp = nums.clone
    val len = nums.length
    nums_cp.foreach(x => {
      if (x != 0) {
        nums(i) = x
        i = i + 1
      }

    })
    for (r <- i until len) {
      nums(r) = 0
    }
  }
}
