package cc.learndata.leetcode


 // Definition for a Node.
class Node(var _value: Int) {
    var value: Int = _value
    var left: Node = null
    var right: Node = null
    var next: Node = null
}

object PopulatingNextRightPointersInEachNode extends App {
  def connect(root: Node): Node = {
    

    def connect1(n1: Node): Unit = {
    if (n1 == null) {} else {
    if (n1.left != null && n1.right != null) {
        println(n1.left.value, "-->", n1.right.value)
        n1.left.next = n1.right 

        connect1(n1.left)
        connect1(n1.right)
        connect2(n1.left, n1.right)

            }
         }
    }

    def connect2(n1: Node, n2: Node): Unit = {
    if (n1 == null || n2 == null) {} else {
    if (n1.right != null && n2.left != null) {
        println(n1.right.value, "-->", n2.left.value)
        n1.right.next = n2.left 
        connect2(n1.right, n2.left)
        }
        }
    }
        
    if (root == null) return null
    connect1(root)

    root
  }
}