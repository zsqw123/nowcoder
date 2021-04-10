package nc

fun main() {
    fun maxLength(arr: IntArray): Int  {
        val hashmap=HashMap<Int,Int>()
        var start=0
        var max=0
        for(i in arr.indices){
            if(hashmap.containsKey(arr[i])){
                start=start.coerceAtLeast(hashmap[arr[i]]!!+1)
                // 因为这个 hash 表并没有 remove 掉被跳过的元素
                // 所以很可能找到的重复元素的位置比 start 要小, 要取其中大的
            }
            max=max.coerceAtLeast(i-start+1)
            hashmap[arr[i]]=i
        }
        return max
    }
}