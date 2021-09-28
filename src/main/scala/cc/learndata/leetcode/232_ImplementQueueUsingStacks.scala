package cc.learndata.leetcode



class MyQueue() {

    var queue = List[Int]()

    def push(x: Int) {
        queue = queue :+ x
    }

    def pop(): Int = {
        val p = queue(0) 
        queue = queue.drop(1)
        p
    }

    def peek(): Int = {
        queue(0) 
    }

    def empty(): Boolean = {
        queue.length == 0
    }

}
  

