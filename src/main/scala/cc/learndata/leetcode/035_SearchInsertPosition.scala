package cc.learndata.leetcode
import scala.util.control.Breaks

object SearchInsertPosition extends App {

  def searchInsertPosition(nums: Array[Int], target: Int): Int = {

    var idx = 0
    var i = 0
    var res = 0

    Breaks.breakable{

    for (i <- nums.indices) {
        if (nums(i) >= target) {
            res = i
            Breaks.break()
        } else if (i == (nums.length - 1)) {
            res = i + 1
            Breaks.break()} 

    }
}
    res
  }
}