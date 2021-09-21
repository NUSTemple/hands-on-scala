package cc.learndata.leetcode

object PascalTriangle extends App {
  def generate(numRows: Int): List[List[Int]] = {
    var res = List[List[Int]]()
    if (numRows >= 1)    res :+= List(1)
    if (numRows >= 2)    res :+= List(1, 1)

    for (row <- 3 to numRows) {
        res :+= generateNextRow(res(row - 2))
    }
    
    res
  }

  def generateNextRow(l: List[Int]):List[Int] = {
    val nextRow = {
    for (i <- 0 to l.length - 2 ) yield {
         l(i) + l(i + 1)
    } }
    1 +: nextRow.toList :+ 1
  }
}