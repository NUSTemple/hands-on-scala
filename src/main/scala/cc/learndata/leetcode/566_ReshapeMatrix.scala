package cc.learndata.leetcode

object ReshapeMatrix extends App {

  def matrixReshape(mat: Array[Array[Int]], r: Int, c: Int): Array[Array[Int]] = {
    val matrixSize = mat.map(x => x.length).sum
    val matrixFlatten = for {row <- mat; col <- row} yield col

    if (matrixSize == r*c){
        matrixFlatten.grouped(c).toArray
    }
    else mat
  }
}