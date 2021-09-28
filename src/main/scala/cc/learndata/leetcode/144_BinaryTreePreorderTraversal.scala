package cc.learndata.leetcode

object BinaryTreePreorderTraversal extends App {

  def preorderTraversal(root: TreeNode): List[Int] = {


    // Preorder (Root, Left, Right)
    
    if (root == null) return List()
    
    List(root.value) ++ preorderTraversal(root.left) ++ preorderTraversal(root.right)

  }

}
