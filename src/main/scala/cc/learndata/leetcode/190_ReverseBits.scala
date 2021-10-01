package cc.learndata.leetcode

object ReverseBits extends App{
    def reverseBits(x: Int): Int = {
        
        var result = 0
        var num = x
        var position = 31 // 0 indexed
        while(position >= 0){
            result += (num & 1) << position // take last bit of the number and shift to front/right
            num = num >> 1 // shift number 1 place to left, to get next bit in the next interation
            position -= 1 // reduce the position to left shift (num&1)
        }
        result
        
    }
}