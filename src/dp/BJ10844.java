package dp;

import java.io.IOException;
import java.util.Scanner;

public class BJ10844 {

    /*
    45656이란 수를 보자.

    이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.

    세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.

    N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)

    dp[1] = 9 : 1 2 3 4 5 6 7 8 9
    dp[2] = 17 : 10 12 / 21 23 / 32 34 / 43 45 / 54 56 / 65 67 / 76 78 / 87 89 / 98
    dp[3] = 32 : 101 121 123 / 210 212 232 234 / 321 323 343 345 / 432 434 454 456 /
                 543 545 565 567 / 654 656 676 678 / 765 767 787 789 / 876 878 898 /
                 987 989 /
    */

    public static int N; static long dp[][];

    public void solution(){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        dp = new long [101][11];

        for (int i=1; i<=9; i++) {

            dp[1][i] = 1;
        }

        for (int i=2; i<=N; i++) {

            dp[i][0] = dp[i-1][1];

            for (int j=1; j<=9; j++) {

                if (j == 9) {

                    dp[i][j] = dp[i-1][j-1];

                } else {

                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
                }
            }
        }

        long sum = 0;

        for (int i=0; i<10; i++) {

            sum += dp[N][i];
        }

        System.out.println(sum % 1000000000);
    }
}
