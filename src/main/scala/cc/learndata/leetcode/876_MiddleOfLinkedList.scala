package cc.learndata.leetcode



object MiddleOfLinkedList extends App {
    def middleNode(head: ListNode): ListNode = {
        
        var i = 1
        var next = head.next
        var l = new ListNode()
        while (next != null) {
            next = next.next
            i = i + 1
        }
        val middle = (i ) / 2 + 1
        var next2 = head 
        if (middle > 1) {
        for (j <- 1 to (middle - 1)) {
            next2 = next2.next
        }}
        next2

    }


}