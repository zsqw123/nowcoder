package nc

fun main() {
    fun getLongestPalindrome(A: String,n: Int): Int  {
        var maxLen=0
        val len=n-1
        for(i in 0..len){
            var l=i // 中心扩散 向两边查找
            var r=i
            var tmpLen=0
            while(r<=len && A[r]==A[i]) { // 向右找到最长的相等的字符串
                tmpLen++
                r++
            }
            l--
            while(l>=0 && r<=len){ // 左右分别查找
                if(A[r]!=A[l]) break
                tmpLen+=2
                r++;l--
            }
            maxLen=maxOf(maxLen,tmpLen)
        }
        return maxLen
    }
}