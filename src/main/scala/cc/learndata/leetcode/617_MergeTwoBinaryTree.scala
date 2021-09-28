package cc.learndata.leetcode

object MergeTwoBinaryTree extends App {

  def mergeTrees(root1: TreeNode, root2: TreeNode): TreeNode = {

    if (root1 == null && root2 == null) return null

    if (root1 != null && root2 != null) {
      new TreeNode(root1.value + root2.value, mergeTrees(root1.left, root2.left), mergeTrees(root1.right, root2.right))
    } else if (root1 != null && root2 == null) {
      root1
    } else {
      root2
    } 
  }
}
