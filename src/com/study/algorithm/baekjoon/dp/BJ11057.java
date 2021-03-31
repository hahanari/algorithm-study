package dp;

import java.util.Scanner;

public class BJ11057 {

    /* 오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이때, 인접한 수가 같아도 오름차순으로 친다.

    예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.

    수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.

    N=1 =   0 1 2 3 4 5 6 7 8 9
    N=2 =   00 01 02 03 04 05 06 07 08 09
            11 12 13 14 15 16 17 18 19
            22 23 24 25 26 27 28 29
            33 34 35 36 37 38 39
            44 45 46 47 48 49
            55 56 57 58 59
            66 67 68 69
            77 78 79
            88 89
            99
    dp[3] = 000 001 002 003 004 005 006 007 008 009
            011 012 013 014 015 016 017 018 019
            022 023 024 025 026 027 028 029

    dp[i][j] = dp[i-1][j] * j
    */

    public static int N; static long dp[][];

    public void solution() {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        dp = new long[1001][11];

        for(int i=0; i<=9; i++) {

            dp[1][i] = i;

            System.out.println("dp[1][" + i + "]=" + dp[1][i]);

        }

        for (int i=2; i<=N; i++) {

            int s = 0;

            for (int j=s; j<=9; j++) {

                dp[i][j] = dp[i-1][j] * s;

                System.out.println("dp[" + i + "][" + j + "]=" + dp[i][j]);

                s++;
            }
        }

        long sum = 0;

        for (int i=0; i<10; i++) {

            sum += dp[N][i];
        }

        System.out.println(sum % 10007);

    }


}
