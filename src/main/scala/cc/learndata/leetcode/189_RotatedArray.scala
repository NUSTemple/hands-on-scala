package cc.learndata.leetcode

object RotatedArray extends App {
  def rotatedArray(nums: Array[Int], k: Int): Unit = {
    val newArray = nums.clone
    val j = k % nums.length
    var p = 0
    nums.foreach(v => {
      nums(p) = newArray((p + nums.length - j) % nums.length)
      p += 1
    })
  }
}
