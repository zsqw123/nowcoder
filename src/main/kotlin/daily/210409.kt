package daily

fun main() {
    // 快速排序
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

    fun sort(array: IntArray) {
        if (array.isEmpty()) return
        fastSort(array, 0, array.size - 1)
    }

    val array = intArrayOf(7, 5, 6, 8, 2, 0, 1, 5, 9, 3, 2, 0, 5, 6, 12, 0, 11, 6, 3, 0, 5, 6, 3)
    sort(array)
    array.forEach { print("$it ") }

    // 冒泡
    fun bubbleSort(array: IntArray, end: Int) {
        if (end <= 1) return
        for (i in 0 until end) if (array[i] > array[i + 1]) {
            val t = array[i + 1]
            array[i + 1] = array[i]
            array[i] = t
        }
        bubbleSort(array, end - 1)
    }

    val bubbleArray = intArrayOf(7, 5, 6, 8, 2, 0, 1, 5, 9, 3, 2, 0, 5, 6, 12, 0, 11, 6, 3, 0, 5, 6, 3)
    bubbleSort(bubbleArray, bubbleArray.size - 1)
    println()
    bubbleArray.forEach { print("$it ") }
    println()
}