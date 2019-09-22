package dp;

import java.util.Scanner;

public class BJ2579 {

    /*
    계단 오르는 데는 다음과 같은 규칙이 있다.

    - 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
    - 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
    - 마지막 도착 계단은 반드시 밟아야 한다.

    -> 마지막 계단 전 계단(i-1)을 밟은 경우
    dp[i] = dp[i-3] + arr[i-1] + arr[i]

    -> 마지막 계단 전 계단을 밟지 않은 경우
    dp[i] = dp[i-2] + arr[i]

    dp[i] = max(dp[i-3] + arr[i-1] + arr[i], dp[i-2] + arr[i])
    */

    public static int S, N, dp[], arr[];
    public void solution() {

        Scanner sc = new Scanner(System.in);

        // 계단 개수
        N = sc.nextInt();
        arr = new int[N+1];
        arr[0] = 0;

//        System.out.println(N);

        for (int i=1; i<=N; i++) {

            S = sc.nextInt();
            arr[i] = S;
//            System.out.println("arr[" + i + "]: " + arr[i]);
        }

        dp = new int[N+1];

        dp[0] = 0;
        dp[1] = 10;
        dp[2] = 30;

        for(int i=3; i<=N; i++) {

            dp[i] = Math.max(dp[i-3] + arr[i-1] + arr[i], dp[i-2] + arr[i]);

//            System.out.println("i:" + i + " dp[" + i + "]: " + dp[i]);
        }

        System.out.println(dp[N]);
    }

}
