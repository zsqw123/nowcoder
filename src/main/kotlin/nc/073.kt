package nc

fun main() {
    fun MoreThanHalfNum_Solution(numbers: IntArray): Int {
        if(numbers.isEmpty()) return 0
        if(numbers.size==1) return numbers[0]
        var nowVote=numbers[0]
        var count=1
        // 摩尔投票
        for(i in numbers){
            if(i==nowVote) count++ // 和当前投票的数相同, count+1
            else if(--count==0){ // 直到当前投票的数的 count 减为 0, 重新开始计数
                nowVote=numbers[i]
                count=1
            }
        }
        var count2=0
        for(i in numbers)if(i==nowVote)count2++ // 验证
        return if(count2>numbers.size/2) nowVote else 0
    }
}