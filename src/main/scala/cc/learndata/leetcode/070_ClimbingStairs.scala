package cc.learndata.leetcode

object ClimbingStairs extends App {

  def climbStairs(n: Int): Int = {


      var m = scala.collection.mutable.Map[Int, Int]()
      m(1) = 1
      m(2) = 2


      if (n >= 3) {
        for (i <- 3 to n) {

          m(i) = m(i-2) + m(i-1)
        }
      }

      m(n)
      
  }

}
