package cc.learndata.leetcode

object PathSum extends App {

    def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {

        if (root == null) return false

        if (root.value == targetSum && root.left == null && root.right == null) true else hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum - root.value)

        
    }
  
}
