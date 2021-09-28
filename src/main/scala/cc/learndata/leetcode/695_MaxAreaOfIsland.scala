package cc.learndata.leetcode

object MaxAreaOfIsland extends App {
    def maxAreaOfIsland(grid: Array[Array[Int]]): Int = {
        val r = grid.length
        val c = grid(0).length
        val imageFlatten = grid.flatten
        var tmpMaxArea = 0
        var MaxArea = 0
        var historyMap = scala.collection.mutable.Map[Int, Int]()
        var i = 0

        val imageIdx = imageFlatten.map(x => {
            val s = if (x > 0) i else -1
            i = i + 1
            s
        }).filter(_ >= 0) 

        val pixelMap = imageIdx.map(x => (x, 1)).toMap

        println(pixelMap)
        def nearbySearch(idx: Int): Unit = {
            
            if (pixelMap.getOrElse(idx, -1) > 0) {

                if (historyMap.getOrElse(idx, -1) > 0) {
                    //pixel checked, skip
                }
                else {
                historyMap(idx) = 1
                tmpMaxArea += 1
                MaxArea = tmpMaxArea.max(MaxArea)

                val sc = flattenIdxToImageIdx(idx, c)(1)
                val sr = flattenIdxToImageIdx(idx, c)(0)
                val leftIdx: Int = if (sc > 0) imageIdxToFlattenIdx(sr, sc - 1, c) else -1
                val rightIdx: Int = if (sc < c-1) imageIdxToFlattenIdx(sr, sc + 1, c) else -1
                val upIdx: Int = if (sr > 0) imageIdxToFlattenIdx(sr - 1, sc, c) else -1
                val downIdx: Int = if (sr < r-1) imageIdxToFlattenIdx(sr + 1, sc, c) else -1

                val candidates = Array(leftIdx, rightIdx, upIdx, downIdx).filter(_ > -1)

                candidates.foreach(x => {
                    if (pixelMap.getOrElse(x, -1) > 0) {
                        //belows to image pixel
                        nearbySearch(x)
                    }

                }) 
            }
            }
        }

    imageIdx.foreach( x => {
        tmpMaxArea = 0
        nearbySearch(x)
    })
    
    MaxArea
    
    }

    def flattenIdxToImageIdx(i: Int, c: Int): Array[Int] = {
      Array((i - i % c) / c, i % c)
    }
  
    def imageIdxToFlattenIdx(sr: Int, sc: Int, c: Int): Int = {
      sr * c + sc
    }
}
