package cc.learndata.leetcode

object InsertIntoABinarySearchTree extends App {
    def insertIntoBST(root: TreeNode, `val`: Int): TreeNode = {

        var rt = root.copy()

        def insertIntoBST(rt: TreeNode, `val`: Int):Unit = {
            
            if (rt == null) rt.value = `val`

            if (rt.value > `val`) {
                if (rt.left == null) rt.left = new TreeNode(`val`) else
                insertIntoBST(rt.left, `val`)
            }
                
                
                 else {if (rt.right == null) rt.right = new TreeNode(`val`) else 
                     insertIntoBST(rt.right, `val`) }
        
        } 
        
        rt

    }
}