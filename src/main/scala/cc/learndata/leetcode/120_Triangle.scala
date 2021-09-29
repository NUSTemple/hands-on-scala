package cc.learndata.leetcode

object Triangle extends App {

  def minimumTotal(triangle: List[List[Int]]): Int = {

    val n = triangle.length
    var m = scala.collection.mutable.Map[(Int, Int), Int]()
    var tmpMin = triangle(0)(0)

    m((1, 1)) = triangle(0)(0)
    for (i <- 2 to n) {
      tmpMin = Int.MaxValue
      for (j <- triangle(i - 1).indices) {
        m((i, j + 1)) = triangle(i - 1)(j) + m
          .getOrElse((i - 1, j + 1), Int.MaxValue)
          .min(m.getOrElse((i - 1, j), Int.MaxValue))
        tmpMin = tmpMin.min(m((i, j + 1)))

      }
    }

    tmpMin
  }

}
