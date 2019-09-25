package dp;

import java.util.Scanner;

public class BJ11726 {

    /*
    2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

    아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

    dp[1] = 1
    dp[2] = 2
    dp[3] = 3
    dp[4] = 5

    dp[n] = dp[n-1] + dp[n-2]
    */

    public static int N, dp[];

    public void solution() {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        dp = new int[N+1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 5;

        for(int i=5; i<=N; i++) {
            dp[i] = dp[i-2] + dp[i-1];
//                System.out.println("i:" + i + " dp[" + i+ "]: " + dp[i]);
        }

        System.out.println(dp[N]);
    }
}
