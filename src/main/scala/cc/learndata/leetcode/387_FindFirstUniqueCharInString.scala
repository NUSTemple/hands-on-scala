package cc.learndata.leetcode

object FindFirstUniqueCharInString extends App {

    def firstUniqChar(s: String): Int = { 
        var m = scala.collection.mutable.Map[Char, Int]()
        val sc = s.toCharArray()
        sc.foreach(x => {
            val i = m.getOrElse(x, 0)
            m(x) = i + 1
        })

        var j = 0
        sc.foreach(x => {
            if(m.getOrElse(x, 0) == 1) return j
            j += 1
        })
    
        -1
    }
    

}