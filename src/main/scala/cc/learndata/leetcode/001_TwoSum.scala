package cc.learndata.leetcode
object TwoSum extends App {

  /* 
  Time Submitted    Status    Runtime Memory  Language
  09/10/2021 22:06	Accepted	1154 ms	71.5 MB	scala 
  */

  def findSumPair(nums: Array[Int], target: Int): Array[Int] = {
    val arrayLength = nums.size
    var numsMap = collection.mutable.Map[Int, Int]()
    for (i <- 0 until nums.size) {
      numsMap += (nums(i) -> i)
    } 

    var matched = 0
    var i = 0
    var result = Array(-1, -1)
    while (matched == 0 && i <= arrayLength ) {

      val firstElement = nums(i)
      val targetSecondElement = target - firstElement
      val secondElementIndex = numsMap.getOrElse(targetSecondElement, -1)

      if (secondElementIndex > 0 && secondElementIndex != i) {
          matched = 1
          result = Array(i, secondElementIndex)
      }
      i += 1
    }

    result
}
}

