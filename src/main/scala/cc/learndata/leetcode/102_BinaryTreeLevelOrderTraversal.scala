package cc.learndata.leetcode

object BinaryTreeLevelOrderTraversal extends App {

    def levelOrder(root: TreeNode): List[List[Int]] = {
        if (root == null) return null
        var m = scala.collection.mutable.Map[Int, List[Int]]()
        var i = 0
        
        def levelOrder(n: TreeNode, i: Int): Unit = {
            if (n == null) {}
            else {

                m(i) = m.getOrElse(i, List[Int]()) :+ n.value
                levelOrder(n.left, i + 1)
                levelOrder(n.right, i + 1)
            }
        }
        levelOrder(root, i)
        m.toSeq.map(x => x._2).toList
    }
  
}
