package com.algorithm.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q68644 {

    // https://programmers.co.kr/learn/courses/30/lessons/68644

    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> sumOfNumbersSet = new HashSet<>();
        int numbersArraySize = numbers.length;
        for (int i = 0; i < numbersArraySize - 1; i++) {
            for (int j = i + 1; j < numbersArraySize; j++) {
                sumOfNumbersSet.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> sumOfNumbersList = new ArrayList<>(sumOfNumbersSet);
        int sumOfNumbersListSize = sumOfNumbersList.size();

        answer = new int[sumOfNumbersListSize];

        for (int i = 0; i < sumOfNumbersListSize; i++) {
            answer[i] = sumOfNumbersList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
