package cc.learndata.leetcode

object BinaryTreePostorderTraversal extends App {

    def postorderTraversal(root: TreeNode): List[Int] = {

        //Postorder (Left, Right, Root)
        
     if (root == null) return List()
    
     postorderTraversal(root.left) ++ postorderTraversal(root.right) ++ List(root.value)

    }
  
}
