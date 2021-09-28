package cc.learndata.leetcode

object RottingOranges extends App {

    def orangesRotting(mat: Array[Array[Int]]): Int = {
        
    val rowLength = mat.length
    val colLength = mat(0).length
    val matSize = rowLength * colLength
    var m0 = scala.collection.mutable.Map[(Int, Int), Int]()
    var m1 = scala.collection.mutable.Map[(Int, Int), Int]()

    for (rowIndex <- mat.indices) {
      for (colIndex <- mat(rowIndex).indices) {
        if (mat(rowIndex)(colIndex) == 2) {
          m0((rowIndex, colIndex)) = 2
        } else if (mat(rowIndex)(colIndex) == 1) {
          m1((rowIndex, colIndex)) = 1
        }
      }
    }
    var i = 0
    var flag = true
    while (m1.size > 0 && flag) {
      var toRemoveList = List[(Int, Int)]()
      for (((r, c), v) <- m0 if v == i + 2) {
          // println(((r, c), v))
        if (r < (rowLength - 1) && m1.getOrElse((r + 1, c), -1) > 0) {
            toRemoveList = toRemoveList :+ (r + 1, c)
            }
        if (r > 0 && m1.getOrElse((r - 1, c), -1) > 0) {
            toRemoveList = toRemoveList :+ (r - 1, c)}
        if (c < (colLength - 1) && m1.getOrElse((r, c + 1), -1) > 0) {
            toRemoveList = toRemoveList :+ (r, c + 1)}
        if (c > 0 && m1.getOrElse((r, c - 1), -1) > 0) {
            toRemoveList = toRemoveList :+ (r, c - 1)}
      }
      if (toRemoveList.length > 0) {
        toRemoveList.foreach(x => m0(x) = i + 3)
        toRemoveList.foreach(x => m1.remove(x))
        i = i + 1}
      else {
          flag =false
      }
    }

    if (m1.size > 0) -1 else i
  }
}
