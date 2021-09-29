package cc.learndata.leetcode

object HouseRobber extends App {

  def rob(nums: Array[Int]): Int = {

    val n = nums.length
    var m = scala.collection.mutable.Map[Int, Int]()
    m(1) = nums(0)
    
    if (n >= 2) m(2) = nums(0).max(nums(1))

    if (n >= 3) {
      for (i <- 3 to n) {

        m(i) = (m(i-2) + nums(i-1)).max(m(i-1))
      }
    }

      m(n)

  }

}
