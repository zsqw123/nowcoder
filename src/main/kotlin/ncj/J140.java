package ncj;

public class J140 {
    private void sort(int[] arr, int start, int end) {
        if (start >= end) return;
        int standard = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (j > i && arr[j] >= standard) j--;
            arr[i] = arr[j];
            while (j > i && arr[i] <= standard) i++;
            arr[j] = arr[i];
        }
        arr[i] = standard;
        sort(arr, start, i - 1);
        sort(arr, i + 1, end);
    }

    public int[] MySort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }
}
