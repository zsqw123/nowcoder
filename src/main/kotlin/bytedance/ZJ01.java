package bytedance;

import java.util.*;

public class ZJ01 {
    // 60% 枚举
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = scan.nextInt();
        boolean[] even = new boolean[n + 1];
        int now = 1;
        long times = 0L;
        while (now <= n) {
            int t = now;
            if (even[now]) now += 1;
            else now = arr[now];
            even[t] = !even[t];
            times++;
        }
        System.out.println(times % 1000000007);
    }
}

class ZJ01_2{
    // 100%
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++) arr[i]=scan.nextInt();
        int[] dp=new int[n+2];
        int mod=1000000007;
        // 因为只能从偶数处+1到达
        // 所以到达所需步数是上一个的加上再一次到达上一个的次数
        //    dp[i]=     dp[i-1]  +  dp[i-1]-dp[arr[i-1]]  +1
        for(int i=2;i<=n+1;i++)
            dp[i]=(dp[i-1]+(dp[i-1]-dp[arr[i-1]]+1)+1)%mod;
        System.out.println(dp[n+1]<0?dp[n+1]+mod:dp[n+1]);
    }
}