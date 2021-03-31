package com.algorithm.string;

public class Q12922 {

    public String solution(int n) {
        String answer = "";

        String a = "수";
        String b = "박";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer = answer + a;
            }

            if (i % 2 == 1) {
                answer = answer + b;
            }
        }

        return answer;
    }
}
