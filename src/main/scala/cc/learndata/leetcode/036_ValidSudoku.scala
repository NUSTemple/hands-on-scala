package cc.learndata.leetcode

object ValidSudoku extends App {
    def isValidSudoku(board: Array[Array[Char]]): Boolean = {

        var m = scala.collection.mutable.Map[Char, List[List[Int]]]()
        for (rc <- 0 until 9){
            val row = board(rc)
            for (cc <- 0 until 9) {
                val col = row(cc)
                if (col != '.') {
                    m(col) = m.getOrElse(col, Nil) :+ List(rc, cc)
                }
            }
        }

        // Check for each element any repeated number

        m.keys.foreach(x => 
            {
                val v = m.getOrElse(x, List(List()))
                var r = List[Int]()
                var c = List[Int]()
                var g = List[Int]()
                for (l <- v) {
                    r = r :+ l(0)
                    c = c :+ l(1)
                    g = g :+ (l(0) / 3  * 3  + l(1) / 3)
                }

                if (r.toSet.toList.length != r.length || 
                    c.toSet.toList.length != c.length ||
                    g.toSet.toList.length != g.length) {return false}
            })

        true
  }
}