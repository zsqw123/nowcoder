package bytedance;

import java.util.*;

public class ZJ02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long t, r;
        while (n > 0) {
            n--;
            long total = scan.nextLong();
            long k = scan.nextLong();
            long remain = total - k;
            long d1 = scan.nextLong();
            long d2 = scan.nextLong();
            t = d1 + d1 + d2; // a<b<c
            if (t <= k && (k - t) % 3 == 0) {
                r = d1 + d2 + d2;
                if (r <= remain && (remain - r) % 3 == 0) {
                    System.out.println("yes");
                    continue;
                }
            }
            t = d2 - d1 - d1; // a>b, b<c
            if (t <= k && (k - t) % 3 == 0) {
                if (d2 > d1) r = d2 + d2 - d1;
                else r = -t;
                if (r <= remain && (remain - r) % 3 == 0) {
                    System.out.println("yes");
                    continue;
                }
            }
            t = -d1 - d1 - d2; // a>b>c
            if (t <= k && (k - t) % 3 == 0) {
                r = -t;
                if (r <= remain && (remain - r) % 3 == 0) {
                    System.out.println("yes");
                    continue;
                }
            }
            t = d1 + d1 - d2; // a<b, b>c
            if (t <= k && (k - t) % 3 == 0) {
                r = d1 + d2;
                if (r <= remain && (remain - r) % 3 == 0) {
                    System.out.println("yes");
                    continue;
                }
            }
            System.out.println("no");
        }
    }
}
