package cc.learndata.leetcode

object FloodFill extends App {

  def floodFill(image: Array[Array[Int]], sr: Int, sc: Int, newColor: Int): Array[Array[Int]] = {
    val r = image.length
    val c = image(0).length

    var imageFlatten = image.flatten

    val originIdx = imageIdxToFlattenIdx(sr, sc, c)
    val originColor = imageFlatten(originIdx)

    var m = scala.collection.mutable.Map[Int, Int]()

    fill(imageFlatten, sr, sc, originColor, newColor, m)

    def fill(f: Array[Int], sr: Int, sc: Int, oldColr: Int, newColor: Int, m: scala.collection.mutable.Map[Int, Int]): Unit ={
      val idx = imageIdxToFlattenIdx(sr, sc , c)
      if (m.getOrElse(idx, -1) > 0) {

        }
        else{ 
        f(idx) = newColor
        m(idx) = 1
        }


      val leftIdx: Int = if (sc > 0) imageIdxToFlattenIdx(sr, sc - 1, c) else -1
      val rightIdx: Int = if (sc < c-1) imageIdxToFlattenIdx(sr, sc + 1, c) else -1
      val upIdx: Int = if (sr > 0) imageIdxToFlattenIdx(sr - 1, sc, c) else -1
      val downIdx: Int = if (sr < r-1) imageIdxToFlattenIdx(sr + 1, sc, c) else -1

      val candidates = Array(leftIdx, rightIdx, upIdx, downIdx).filter(_ > -1)

      candidates.foreach(x => {
        if (m.getOrElse(x, -1) > 0) {

        }
        else{

        if (f(x) == oldColr) {
        f(x) = newColor
        m(x) = 1
        val newIdx = flattenIdxToImageIdx(x, c)
        fill(f, newIdx(0), newIdx(1), oldColr, newColor, m )}

      }
    })

    }
    imageFlatten.grouped(c).toArray
  }

  def flattenIdxToImageIdx(i: Int, c: Int): Array[Int] = {
      Array((i - i % c) / c, i % c)
    }

  
  def imageIdxToFlattenIdx(sr: Int, sc: Int, c: Int): Int = {
      sr * c + sc
    }
}