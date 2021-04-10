package nc

fun main() {
    fun getLongestPalindrome(A: String,n: Int): Int  {
        var maxLen=0
        val len=n-1
        for(i in 0..len){
            var l=i
            var r=i
            var tmpLen=0
            while(r<=len && A[r]==A[i]) {
                tmpLen++
                r++
            }
            l--
            while(l>=0 && r<=len){
                if(A[r]!=A[l]) break
                tmpLen+=2
                r++;l--
            }
            maxLen=maxOf(maxLen,tmpLen)
        }
        return maxLen
    }
}