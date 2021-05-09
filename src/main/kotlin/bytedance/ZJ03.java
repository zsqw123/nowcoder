package bytedance;

import java.util.*;

public class ZJ03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int max = scan.nextInt();
        String s = scan.next();
        int maxCnt = 0;
        char[] sa = s.toCharArray();
        char[] arr = new char[len + 2];
        arr[0] = 'b';
        System.arraycopy(sa, 0, arr, 1, len);
        arr[len + 1] = 'b';
        LinkedList<Integer> diffList = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'b') {
                if (diffList.size() > max)
                    maxCnt = Math.max(maxCnt, i - diffList.poll() - 1);
                diffList.offer(i);
            }
        }

        arr[0] = 'a';
        arr[len + 1] = 'a';
        diffList.clear();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                if (diffList.size() > max)
                    maxCnt = Math.max(maxCnt, i - diffList.poll() - 1);
                diffList.offer(i);
            }
        }
        System.out.println(maxCnt);
    }
}
