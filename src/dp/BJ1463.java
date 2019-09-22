package dp;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1463 {

    /*
    정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

    1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
    2. X가 2로 나누어 떨어지면, 2로 나눈다.
    3. 1을 뺀다.

    정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

    hint.
    10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.
    */

    /*
    N=1
    N=2, /2, 1
    N=3, /3, 1
    N=4, /2 /2, 2
    N=5, -1 /2 /2, 3
    N=6, /3 /2, 2
    N=7, -1 /3 /2, 3
    N=8, /2 /2 /2, 3

    dp[1] = 0 dp[5] = 3 dp[7] = 3
    dp[2] = 1 dp[4] = 2 dp[8] = 3 dp[10] = 4
    dp[3] = 1 dp[6] = 2 dp[9] = 2


    if(i%3==0) dp[i] = min(dp[i], dp[i/3] + 1)
    if(i%2==0) dp[i] = min(dp[i], dp[i/2] + 1)
    dp[i] = dp[i-1] + 1
    */

    public static int N, dp[];

    public int solution() {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        dp = new int[N+1];
        Arrays.fill(dp, -1);

        dp[0] = dp[1] = 0;

        sc.close();

        for(int i=2; i<=N; i++) {

            dp[i] = dp[i-2] + 1;

            if(i%3 == 0)
                dp[i] = Math.min(dp[i], dp[i/3]+1);
            if(i%2 == 0)
                dp[i] = Math.min(dp[i], dp[i/2]+1);
        }

        return dp[N];
    }
}
