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

  override def toString(): String = {
    if (this == null) return ""

    this match {
      case n: TreeNode => {
        "        " + n.value.toString
          .padTo(4, ' ') + "\n" + (if (n.left != null)
                                     (n.left.toString.padTo(4, ' '))
                                   else "    ") + (if (n.right != null)
                                                     (n.right.toString
                                                       .padTo(4, ' '))
                                                   else "    ")
      }
      case _ => ""
    }

  }
}
