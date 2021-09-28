package cc.learndata.leetcode

object FindMaxTreeDepth extends App {

    def maxDepth(root: TreeNode): Int = {
          
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

    if (root != null) findMaxDepth(root, 1, 1) else 0
        
    }
}
