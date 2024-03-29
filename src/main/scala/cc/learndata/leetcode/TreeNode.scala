package cc.learndata.leetcode

case class TreeNode(
    _value: Int = 0,
    _left: TreeNode = null,
    _right: TreeNode = null
) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right

  def findMaxDepth(): Int = {
    def findMaxDepth(n: TreeNode, currentDepth: Int, tmpMaxDepth: Int): Int = {
      if (n == null) return tmpMaxDepth

      if (n.left != null || n.right != null) {
        findMaxDepth(
          n.left,
          currentDepth + 1,
          (currentDepth + 1).max(tmpMaxDepth)
        ).max(
          findMaxDepth(
            n.right,
            currentDepth + 1,
            (currentDepth + 1).max(tmpMaxDepth)
          )
        )
      } else tmpMaxDepth

    }

    if (this != null) findMaxDepth(this, 1, 1) else 0

  }

  def inorderTraversal(): List[Int] = {
        // Inorder (Left, Root, Right)

        if (this == null) return List()

        ((if (this.left == null) List() else this.left.inorderTraversal) ++ List(this.value) ++ (if (this.right == null) List() else this.right.inorderTraversal)) 
  }

  override def toString(): String = {
      this.inorderTraversal.mkString(",")
  }
}
