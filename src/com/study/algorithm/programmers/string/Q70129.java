package com.algorithm.string;

public class Q70129 {

    public int[] solution(String s) {
        int convertCount = 0;
        int removeZeroCount = 0;

        String result = "";
        do {
            for (int i = 0; i < s.length(); i++) {
                if ("0".equals(Character.toString(s.charAt(i)))) {
                    removeZeroCount++;
                }
            }

            if (s.contains("0")) {
                s = s.replace("0", "");
            }

            s = Integer.toBinaryString(s.length());

            convertCount++;

        } while (!"1".equals(s));

        return new int[]{convertCount, removeZeroCount};
    }
}
