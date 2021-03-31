package dp;

import java.util.Scanner;

public class BJ9095 {

    /*
    정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

    - 1+1+1+1
    - 1+1+2
    - 1+2+1
    - 2+1+1
    - 2+2
    - 1+3
    - 3+1

    정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

    N=1 -> 1 -> 1
    N=2 -> 1+1 2 -> 2
    N=3 -> 1+1+1 1+2 2+1 3 -> 4
    N=4 -> 1+1+1+1 1+1+2 1+2+1 2+1+1 1+3 3+1 2+2 -> 7
    N=5 -> 1+1+1+1+1 1+1+1+2 1+1+2+1 1+2+1+1 2+1+1+1 1+1+3 1+3+1 3+1+1 1+2+2 2+1+2 2+2+1 2+3 3+2 -> 13

    N=7 -> 44
    N=10 -> 274

    dp[i] = dp[i-3] + dp[i-2] + dp[i-1]
    */

    public static int T, N, dp[];

    public void solution() {

        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for (int i=0; i<T; i++) {

            N = sc.nextInt();
            dp = new int[N+1];

            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int j=4; j<=N; j++) {
                dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
//                System.out.println("j:" + j + " dp[" + j+ "]: " + dp[j]);
            }

            System.out.println(dp[N]);
        }
    }

}
