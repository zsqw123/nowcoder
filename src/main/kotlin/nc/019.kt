package nc

fun main() {
    fun maxsumofSubarray(arr: IntArray): Int {
        var max = Int.MIN_VALUE
        var tmp = 0
        for (i in arr) if (i < 0) {
            max = maxOf(max, tmp)
            tmp += i
            if (tmp < 0) tmp = 0
        } else tmp += i
        return maxOf(max, tmp)
    }
}