package cc.learndata.leetcode
import scala.util.control.Breaks

object TwoSumV3 extends App {

  def findSumPair(nums: Array[Int], target: Int): Array[Int] = {

    val map = scala.collection.mutable.Map[Int, Int]()
    var count = 0;
    for (num <- nums) {
      val comp = target - num
      map.get(comp) match {
        case None        => { map.put(num, count) }
        case Some(index) => return Array(index, count)
      }
      count = count + 1
    }
    Array(0, 0)
  }

}
