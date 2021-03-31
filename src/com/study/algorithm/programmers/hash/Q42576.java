package com.algorithm.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q42576 {

    // https://programmers.co.kr/learn/courases/30/lessons/42576

    public String solution(String[] participant, String[] completion) {

        List<String> participantList = new ArrayList<>(Arrays.asList(participant));

        Map<String, Integer> participantMap = new HashMap<>();

        participantList.forEach(name -> {
            int count = 0;
            if (participantMap.get(name) == null) {
                count = 1;
            } else {
                count = participantMap.get(name) + 1;
            }
            participantMap.put(name, count);
        });

        List<String> completionList = new LinkedList<>(Arrays.asList(completion));

        completionList.forEach(name -> {
            participantMap.put(name, participantMap.get(name) - 1);
        });

        for (String key: participantMap.keySet()) {
            if (participantMap.get(key) > 0) {
                return key;
            }
        }

        return "";
    }
}
