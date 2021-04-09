package nc

fun main() {
    var kk = 0
    fun fastSort(array: IntArray, start: Int, end: Int) {
        if (start >= end || start >= kk) return // start 大于 k, 没必要排序了
        val p = array[start]
        var l = start
        var r = end
        while (l < r) {
            while (array[r] >= p && l < r) r--
            array[l] = array[r]
            while (array[l] <= p && l < r) l++
            array[r] = array[l]
        }
        array[l] = p
        fastSort(array, start, l - 1)
        fastSort(array, l + 1, end)
    }

    fun GetLeastNumbers_Solution(input: IntArray, k: Int): IntArray {
        if (k > input.size) return intArrayOf()
        kk = k
        fastSort(input, 0, input.size - 1)
        return input.copyOf(k)
    }
}