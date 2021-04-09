package nc

fun main() {
    fun fastSort(array: IntArray, start: Int, end: Int) {
        if (start >= end) return
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
}