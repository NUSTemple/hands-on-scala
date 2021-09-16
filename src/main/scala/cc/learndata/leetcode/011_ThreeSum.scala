package cc.learndata.leetcode
import scala.util.control.Breaks
object ThreeSum extends App {

  def threeSum(nums: Array[Int]): List[List[Int]] = {

    val target = 0 // the target is the number after the sum
    val sortedArray = nums.sorted
    var resultsArrayOfTriplets = Set[Array[Int]]()
    if (sortedArray.length >= 3) {
      if (
        sortedArray(0) == sortedArray(sortedArray.length - 1) && sortedArray(
          0
        ) == 0
      ) {
        val triplet = Array(0, 0, 0)
        resultsArrayOfTriplets += triplet
      } else {

        for (i <- sortedArray.indices) {
          var j = i + 1
          var k = sortedArray.length - 1
          val twoSum = target - sortedArray(i)

          Breaks.breakable {
            while (j < sortedArray.length && j < k) {
              val sum = sortedArray(j) + sortedArray(k)
              if (k == j) Breaks.break()
              if (sum > twoSum) {
                k -= 1
              } else if (sum < twoSum) {
                j += 1
              } else if (sum == twoSum) {
                val triplet =
                  Array(sortedArray(i), sortedArray(j), sortedArray(k))
                resultsArrayOfTriplets += triplet
                j += 1
                k -= 1
              }
            }
          }
        }
      }
    }
    resultsArrayOfTriplets.map(_.toList).toList
  }
}
