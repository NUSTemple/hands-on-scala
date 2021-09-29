package cc.learndata.leetcode

object InvertBinaryTree extends App {

  def invertTree(root: TreeNode): TreeNode = {


    if (root == null) return null


    val l =  if (root.left != null ) root.left else null
    val r = if (root.right != null ) root.right else null
    root.right = invertTree(l)
    root.left = invertTree(r)
    root

  }
}
