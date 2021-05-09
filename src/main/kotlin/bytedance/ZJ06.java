package bytedance;

import java.util.*;

public class ZJ06 {
    // 35% 暴力法
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int last = scan.nextInt();
        int[] rooms = new int[count];
        for (int i = 0; i < count; i++) rooms[i] = scan.nextInt();
        int min = rooms[0];
        int minIndex = 0;
        for (int i = 0; i < count; i++) {
            if (min > rooms[i]) {
                min = rooms[i];
                minIndex = i;
            }
        }
        if (last - 1 < minIndex) {
            for (int i = 0; i < last; i++) rooms[i]--;
            for (int i = minIndex + 1; i < count; i++) rooms[i]--;
            for (int i = 0; i < count; i++) rooms[i] -= min;
            rooms[minIndex] = min * count + last + count - minIndex - 1;
        } else if (last - 1 > minIndex) {
            for (int i = minIndex; i < last; i++) rooms[i] -= min;
            rooms[minIndex] = min * (last - minIndex);
        } else {
            for (int i = 0; i < count; i++) rooms[i] -= min;
            rooms[minIndex] = min * count;
        }
        for (int n : rooms) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
}

// 正确解法
class ZJ06_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int last = scan.nextInt();
        long[] rooms = new long[count];
        long sum = 0;
        for (int i = 0; i < count; i++) rooms[i] = scan.nextInt();
        long min = rooms[0];
        for (int i = 0; i < count; i++) min = Math.min(min, rooms[i]);
        int k = last - 1;
        while (rooms[k] != min) k = (k + count - 1) % count;
        for (int i = 0; i < count; i++) rooms[i] -= min;
        for (int i = last - 1; i != k; ) {
            rooms[i]--;
            sum++;
            i = (i + count - 1) % count;
        }
        rooms[k] += sum + count * min;
        for (long n : rooms) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
}
