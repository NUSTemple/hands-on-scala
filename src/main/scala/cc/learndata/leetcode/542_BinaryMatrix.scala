package cc.learndata.leetcode

object BinaryMatrix extends App {

  def updateMatrix(mat: Array[Array[Int]]): Array[Array[Int]] = {

    val rowLength = mat.length
        val colLength = mat(0).length
    val matSize = rowLength * colLength
    var m0 = scala.collection.mutable.Map[(Int, Int), Int]()
    var m1 = scala.collection.mutable.Map[(Int, Int), Int]()

    for (rowIndex <- mat.indices) {
      for (colIndex <- mat(rowIndex).indices) {
        if (mat(rowIndex)(colIndex) == 0) {
          m0((rowIndex, colIndex)) = 0
        } else {
          m1((rowIndex, colIndex)) = 1
        }
      }
    }
    var i = 0
 
    while (m1.size > 0) {
      var toRemoveList = List[(Int, Int)]()
      for (((r, c), v) <- m0 if v == i) {
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
      toRemoveList.foreach(x => m0(x) = i + 1)
      toRemoveList.foreach(x => m1.remove(x))
      i = i + 1
    }

    m0.toSeq.sortBy(r => (r._1._1, r._1._2)).map(x => x._2).grouped(colLength).map(x => x.toArray).toArray
  }
}
